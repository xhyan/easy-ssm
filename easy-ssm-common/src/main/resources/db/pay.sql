/*
Navicat MySQL Data Transfer

Source Server         : pay
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : pay

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-05-26 18:47:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` bigint(20) NOT NULL COMMENT 'ID',
  `login_name` varchar(128) DEFAULT NULL COMMENT '登录名',
  `login_pwd` varchar(128) DEFAULT NULL COMMENT '登录密码(不可逆加密)',
  `trade_pwd` varchar(128) DEFAULT NULL COMMENT '交易密码(不可逆加密)',
  `email` varchar(255) DEFAULT NULL COMMENT ' 账号绑定邮箱',
  `email_backup` varchar(255) DEFAULT NULL COMMENT ' 账号绑定备用邮箱',
  `mobile` varchar(20) DEFAULT NULL COMMENT '账号绑定手机号',
  `type` tinyint(4) NOT NULL COMMENT '账户类型(1个人账户；2企业账户)',
  `property` tinyint(4) NOT NULL DEFAULT '1' COMMENT '账户性质（1资金账户，3商户账户，4担保账户）',
  `pay_flag` bigint(20) NOT NULL DEFAULT '0' COMMENT '支付功能控制标志？？？',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '账户状态：1正常,2受限,3冻结,4注销',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  `extend` text COMMENT '扩展字段',
  PRIMARY KEY (`id`),
  KEY `type_user_id` (`type`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户主表';

-- ----------------------------
-- Table structure for account_bank_card
-- ----------------------------
DROP TABLE IF EXISTS `account_bank_card`;
CREATE TABLE `account_bank_card` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account_id` bigint(20) NOT NULL COMMENT '账户id',
  `name` varchar(50) DEFAULT NULL COMMENT '持卡人姓名',
  `credential_type` tinyint(4) DEFAULT '1' COMMENT '证件类型(1:身份证,2护照)',
  `credential_no` varchar(30) DEFAULT NULL COMMENT '证件号',
  `type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '片卡类型:1储蓄卡,2信用卡',
  `number` varchar(25) NOT NULL COMMENT '银行卡号',
  `mobile` varchar(15) DEFAULT NULL COMMENT '手机号',
  `clean_bank_no` varchar(32) DEFAULT NULL COMMENT '分支行清算行号(bank_branch.clean_bank_no)',
  `city` varchar(64) DEFAULT NULL COMMENT '开户行所在城市',
  `is_default` tinyint(4) NOT NULL DEFAULT '0' COMMENT '否是默认银行卡',
  `is_quick_payment` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否已开通快捷支付,0否，1是',
  `quick_payment_config_content` text COMMENT '快捷支付配置信息json串(各通道自行定义结构；如绑定的通道ID,银行用户协议号,银行卡支付协议号)',
  `bind_time` datetime DEFAULT NULL COMMENT '绑定时间',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态(0，不启用；1，已启用)',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `account_id` (`account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户的银行卡管理表';

-- ----------------------------
-- Table structure for account_bill
-- ----------------------------
DROP TABLE IF EXISTS `account_bill`;
CREATE TABLE `account_bill` (
  `id` bigint(20) NOT NULL COMMENT 'ID',
  `account_id` bigint(20) NOT NULL COMMENT '关联账户主表id',
  `occurred_partner_id` bigint(20) NOT NULL COMMENT '流水发生的商户id',
  `channel_account` varchar(255) NOT NULL COMMENT '渠道账号 (如:银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)',
  `biz_type` bigint(20) NOT NULL COMMENT '业务类型(关联biz_type.id)',
  `biz_num` bigint(20) NOT NULL COMMENT '业务编号(充值id,提现id,转账id)',
  `type` tinyint(4) NOT NULL COMMENT '流水类型:1收入,2支出',
  `channel_id` bigint(20) NOT NULL COMMENT '渠道ID',
  `pipeline_id` bigint(20) NOT NULL COMMENT '通道ID',
  `name` varchar(50) DEFAULT NULL COMMENT '流水备注',
  `amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '发生金额，单位：分',
  `current_amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '账户当前余额，单位：分',
  `trade_date` datetime NOT NULL COMMENT '记账日(日切相关,对账时使用)',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  `memo` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `index_account_id_gmt_create` (`account_id`,`gmt_create`) USING BTREE,
  KEY `index_account_id_amount` (`account_id`,`amount`) USING BTREE,
  KEY `index_partner_id_gmt_create` (`gmt_create`) USING BTREE,
  KEY `index_gmt_create` (`gmt_create`) USING BTREE,
  KEY `index_account_id_trade_date` (`account_id`,`trade_date`) USING BTREE,
  KEY `occurred_partner_id` (`occurred_partner_id`) USING BTREE,
  KEY `channel_id` (`channel_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户收支记录(流水)表';

-- ----------------------------
-- Table structure for account_daily_snapshot
-- ----------------------------
DROP TABLE IF EXISTS `account_daily_snapshot`;
CREATE TABLE `account_daily_snapshot` (
  `id` bigint(20) NOT NULL COMMENT 'ID',
  `account_id` bigint(20) NOT NULL COMMENT '账户ID',
  `balance` bigint(20) NOT NULL DEFAULT '0' COMMENT '账户可交易额度',
  `credit_amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '可交易的信用额度',
  `frozen_amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '已冻结的额度',
  `trade_date` date NOT NULL COMMENT '交易日',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `account_id` (`account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户日切记录表';

-- ----------------------------
-- Table structure for account_fund
-- ----------------------------
DROP TABLE IF EXISTS `account_fund`;
CREATE TABLE `account_fund` (
  `id` bigint(20) NOT NULL COMMENT '账户id',
  `account_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '账号id',
  `type` tinyint(3) unsigned zerofill NOT NULL DEFAULT '000' COMMENT '资金类型，默认为0账户交易资金',
  `balance` bigint(20) NOT NULL DEFAULT '0' COMMENT '可用余额',
  `credit_amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '可交易的信用额度',
  `frozen_amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '已冻结的额度',
  `daily_balance` bigint(20) NOT NULL DEFAULT '0' COMMENT '日切可交易额度',
  `daily_credit_amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '日切可交易信用额度',
  `daily_frozen_amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '日切已冻结额度',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `accountIdAndVersion` (`account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户资金表，记录账户的资金信息';

-- ----------------------------
-- Table structure for account_fund_frozen
-- ----------------------------
DROP TABLE IF EXISTS `account_fund_frozen`;
CREATE TABLE `account_fund_frozen` (
  `id` bigint(20) NOT NULL COMMENT '资金冻结记录id',
  `account_id` bigint(20) NOT NULL COMMENT '帐户的id',
  `biz_num` bigint(20) DEFAULT NULL COMMENT '业务编号id(old-out_biz_no)',
  `biz_type` tinyint(4) NOT NULL COMMENT '业务类型(biz_type.id)',
  `amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '冻结解冻的金额',
  `credit_amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '使用信用额度',
  `freeze_status` tinyint(4) DEFAULT '1' COMMENT '冻结状态:1冻结 2解冻',
  `freeze_date` datetime DEFAULT NULL COMMENT '冻结时间',
  `unfreeze_date` datetime DEFAULT NULL COMMENT '解冻时间',
  `freeze_trade_date` date NOT NULL COMMENT '冻结交易日',
  `unfreeze_trade_date` date DEFAULT NULL COMMENT '解冻交易日',
  `remark` varchar(250) DEFAULT NULL COMMENT '备注',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `account_id` (`account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户资金冻结解冻表(有状态)';

-- ----------------------------
-- Table structure for account_login_way
-- ----------------------------
DROP TABLE IF EXISTS `account_login_way`;
CREATE TABLE `account_login_way` (
  `id` bigint(20) NOT NULL COMMENT 'ID',
  `account_id` bigint(20) NOT NULL COMMENT '账号ID',
  `third_login_name` varchar(255) NOT NULL COMMENT '第三方登录账号',
  `login_way` int(10) NOT NULL COMMENT '登录方式:1资金账号登录，2家丰网帐号登录，3交易结算账号登录',
  `config_content` text COMMENT '配置信息(不同登录方式自行配置)',
  `memo` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `account_id` (`account_id`,`login_way`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='帐号登录方式';

-- ----------------------------
-- Table structure for account_oper_log
-- ----------------------------
DROP TABLE IF EXISTS `account_oper_log`;
CREATE TABLE `account_oper_log` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `account_id` bigint(20) NOT NULL COMMENT '账户id',
  `type` tinyint(3) unsigned NOT NULL COMMENT '操作类型(1:冻结2:解冻3:受限4:解限5:注销)',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '操作员id',
  `user_name` varchar(50) DEFAULT NULL COMMENT '操作员姓名(冗余字段)',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '操作时间',
  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `account_id` (`account_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8 COMMENT='账户操作日志表';

-- ----------------------------
-- Table structure for account_own_partner
-- ----------------------------
DROP TABLE IF EXISTS `account_own_partner`;
CREATE TABLE `account_own_partner` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `account_id` bigint(20) NOT NULL COMMENT '资金账号ID',
  `partner_id` bigint(20) NOT NULL COMMENT '接入方ID',
  PRIMARY KEY (`id`),
  UNIQUE KEY `key_account_partner` (`account_id`,`partner_id`) USING BTREE,
  KEY `partner_id` (`partner_id`) USING BTREE,
  KEY `account_id` (`account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资金账号归属接入方关联表(account-merchant_partner(1-n))';

-- ----------------------------
-- Table structure for account_verify
-- ----------------------------
DROP TABLE IF EXISTS `account_verify`;
CREATE TABLE `account_verify` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `account_id` bigint(20) DEFAULT NULL COMMENT '账户id',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
  `business_code` int(11) NOT NULL COMMENT '业务编码，每种业务有唯一的编码？？？',
  `random_code` varchar(256) NOT NULL COMMENT '随机码',
  `priod` datetime NOT NULL COMMENT '最后有效时间',
  `status` int(11) DEFAULT NULL COMMENT '验证码状态：1表示未使用 2表示已使用',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `account_id` (`account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户验证表，用于储存验证邮件和验证短信产生的验证码及过期时间';

-- ----------------------------
-- Table structure for auth_resource
-- ----------------------------
DROP TABLE IF EXISTS `auth_resource`;
CREATE TABLE `auth_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url_path` varchar(64) NOT NULL COMMENT 'URL路径',
  `parent_id` varchar(16) DEFAULT NULL,
  `remark` varchar(56) DEFAULT NULL COMMENT '描述',
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=800001 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for auth_role
-- ----------------------------
DROP TABLE IF EXISTS `auth_role`;
CREATE TABLE `auth_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(32) NOT NULL COMMENT '角色名称',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_by` bigint(20) NOT NULL COMMENT '创建人',
  `gmt_create` datetime NOT NULL,
  `gmt_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_role_name` (`role_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for auth_role_res
-- ----------------------------
DROP TABLE IF EXISTS `auth_role_res`;
CREATE TABLE `auth_role_res` (
  `role_id` int(11) NOT NULL,
  `res_id` int(11) NOT NULL,
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`role_id`,`res_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for auth_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `auth_sys_user`;
CREATE TABLE `auth_sys_user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) DEFAULT NULL COMMENT '登录名',
  `status` tinyint(1) DEFAULT NULL COMMENT '用户状态',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `real_name` varchar(50) DEFAULT NULL,
  `sex` tinyint(1) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `mobile` varchar(12) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `last_login` datetime DEFAULT NULL,
  `valid_begin_time` datetime DEFAULT NULL,
  `valid_end_time` datetime DEFAULT NULL,
  `remark` varchar(30) DEFAULT NULL,
  `is_super` tinyint(4) DEFAULT '0' COMMENT '是否是超级管理员',
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for auth_user_role_res
-- ----------------------------
DROP TABLE IF EXISTS `auth_user_role_res`;
CREATE TABLE `auth_user_role_res` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `role_id` bigint(20) NOT NULL COMMENT '角色id',
  `gmt_create` datetime DEFAULT NULL,
  `gmt_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for bank_branch
-- ----------------------------
DROP TABLE IF EXISTS `bank_branch`;
CREATE TABLE `bank_branch` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bank_no` varchar(32) NOT NULL COMMENT '银行的分支行号',
  `bank_code` int(5) NOT NULL DEFAULT '0' COMMENT '银行编号',
  `city_code` int(5) NOT NULL DEFAULT '0' COMMENT '地区编号',
  `clear_bank_no` varchar(32) DEFAULT NULL COMMENT '分支行清算行号',
  `bank_name` varchar(256) NOT NULL COMMENT '分支行名称',
  `status` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=376163 DEFAULT CHARSET=utf8 COMMENT='基础数据-银行分支行基础数据';

-- ----------------------------
-- Table structure for bank_card_bin
-- ----------------------------
DROP TABLE IF EXISTS `bank_card_bin`;
CREATE TABLE `bank_card_bin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `card_bin` varchar(50) DEFAULT NULL COMMENT '卡bin：银行卡前n位，判断卡号的银行归属',
  `channel_code` varchar(32) DEFAULT NULL COMMENT '渠道编码',
  `card_name` varchar(64) DEFAULT NULL COMMENT '银行卡名称',
  `card_type` varchar(32) DEFAULT NULL COMMENT '卡类型：CC 贷记卡；DC 借记卡；SC 准贷记卡',
  `bin_digits` int(11) DEFAULT NULL COMMENT '卡bin位数',
  `card_digits` int(11) unsigned DEFAULT NULL COMMENT '银行卡号位数',
  `flag` int(4) DEFAULT '1' COMMENT '卡bin标志：0表示不启用，1表示启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5396 DEFAULT CHARSET=utf8 COMMENT='基础数据-银行卡bin(检验银行卡时使用)';

-- ----------------------------
-- Table structure for bank_trust
-- ----------------------------
DROP TABLE IF EXISTS `bank_trust`;
CREATE TABLE `bank_trust` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `bank_num` varchar(20) NOT NULL COMMENT '银行账号',
  `customer_name` varchar(20) NOT NULL COMMENT '银行资金账号名称',
  `address` varchar(50) NOT NULL COMMENT '开户行地址',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='基础数据-本系统资金托管银行账号';

-- ----------------------------
-- Table structure for biz_type
-- ----------------------------
DROP TABLE IF EXISTS `biz_type`;
CREATE TABLE `biz_type` (
  `id` bigint(20) NOT NULL,
  `biz_name` varchar(255) NOT NULL COMMENT '业务类型名称',
  `memo` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基础数据---业务类型管理';

-- ----------------------------
-- Table structure for channel
-- ----------------------------
DROP TABLE IF EXISTS `channel`;
CREATE TABLE `channel` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '状态:1正常,2暂停',
  `code` varchar(30) NOT NULL COMMENT '渠道代号,如(ABC,ALIPAY,WEIPAY,UMPAY),本表唯一',
  `short_name` varchar(20) NOT NULL COMMENT '渠道简称',
  `name` varchar(20) NOT NULL COMMENT '渠道名称',
  `website` varchar(20) DEFAULT NULL COMMENT '渠道网址',
  `icon_url` varchar(500) DEFAULT NULL COMMENT '渠道的icon地址',
  `type` tinyint(4) NOT NULL COMMENT '渠道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)',
  `bank_account_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '渠道支持的银行账户类型(0:全部,1:借记卡,2:贷记卡)',
  `internet_bank_type` tinyint(4) NOT NULL COMMENT '渠道支持的网银类型(0:全部;1:个人网银,2:企业网银)',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8 COMMENT='渠道主表';

-- ----------------------------
-- Table structure for channel_pipeline
-- ----------------------------
DROP TABLE IF EXISTS `channel_pipeline`;
CREATE TABLE `channel_pipeline` (
  `id` bigint(20) NOT NULL,
  `channel_id` bigint(20) NOT NULL,
  `pipeline_id` bigint(20) NOT NULL,
  `memo` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  UNIQUE KEY `channel_id` (`channel_id`,`pipeline_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='渠道-通道 关联关系表';

-- ----------------------------
-- Table structure for channel_pipeline_fee_percent
-- ----------------------------
DROP TABLE IF EXISTS `channel_pipeline_fee_percent`;
CREATE TABLE `channel_pipeline_fee_percent` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '提现银行设置id',
  `channel_id` bigint(20) NOT NULL COMMENT '渠道id',
  `pipeline_id` bigint(20) NOT NULL COMMENT '通道ID',
  `fee_percent` varchar(20) NOT NULL COMMENT '手续费率',
  `receive_time` int(11) NOT NULL DEFAULT '0' COMMENT '到账时间,0立即到账,其他单位为小时',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态,1正常2暂停',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='基础数据-渠道/通道费率设置';

-- ----------------------------
-- Table structure for cru_account
-- ----------------------------
DROP TABLE IF EXISTS `cru_account`;
CREATE TABLE `cru_account` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '账户设置id',
  `account_id` bigint(20) NOT NULL COMMENT '账号id',
  `amount` bigint(20) NOT NULL COMMENT '限制前余额',
  `limit_feature` int(11) NOT NULL COMMENT '受限功能',
  `limit_time` int(11) DEFAULT NULL COMMENT '限制时间',
  `limit_unit` int(11) DEFAULT NULL COMMENT '限制时间单位,1小时,2天',
  `limit_reason` int(11) DEFAULT NULL COMMENT '限制原因,1异常交易,2违反相关市场规范,3交易风险控制,4其他',
  `descr` varchar(100) DEFAULT NULL COMMENT '说明',
  `notify_type` varchar(10) DEFAULT NULL COMMENT '通知用户方式,1站内信,2手机短信,3邮箱(多种方式用,分隔)',
  `op_user_id` bigint(20) DEFAULT NULL COMMENT '添加限制操作员id',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `status` int(11) DEFAULT '1' COMMENT '记录状态(1:生效;2:失效)',
  `relieve_user_id` bigint(20) DEFAULT NULL COMMENT '解除限制操作员(0:自动解除限制)',
  `relieve_time` datetime DEFAULT NULL COMMENT '解除时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=166 DEFAULT CHARSET=utf8 COMMENT='风控-账户类设置';

-- ----------------------------
-- Table structure for cru_acctount_withdraw
-- ----------------------------
DROP TABLE IF EXISTS `cru_acctount_withdraw`;
CREATE TABLE `cru_acctount_withdraw` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '账户提现规则id',
  `account_id` bigint(20) NOT NULL COMMENT '账户Id',
  `cru_account_type` tinyint(3) unsigned NOT NULL COMMENT '账户类型(冗余字段),与account.type相同',
  `daily_amount` bigint(20) unsigned NOT NULL COMMENT '日提现额度',
  `each_min_amount` bigint(20) unsigned NOT NULL COMMENT '每笔最低提现金额',
  `daily_times` int(10) unsigned NOT NULL COMMENT '日提现次数',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  `status` int(10) unsigned NOT NULL DEFAULT '1' COMMENT '状态(1:生效2:失效)',
  PRIMARY KEY (`id`),
  KEY `cru_acct_withdraw_accountId` (`account_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='风控-账户提现限制表';

-- ----------------------------
-- Table structure for cru_channel_limit
-- ----------------------------
DROP TABLE IF EXISTS `cru_channel_limit`;
CREATE TABLE `cru_channel_limit` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '限额id',
  `channel_id` bigint(20) NOT NULL COMMENT '渠道id',
  `limit_content` varchar(1000) DEFAULT NULL COMMENT '限额JSON串',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8 COMMENT='风控-渠道限额';

-- ----------------------------
-- Table structure for cru_transfer
-- ----------------------------
DROP TABLE IF EXISTS `cru_transfer`;
CREATE TABLE `cru_transfer` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '转账规则id',
  `transfer_type` int(10) unsigned NOT NULL COMMENT '转账类型(3:转账到地利宝4:转账到银行卡)',
  `account_type` int(10) unsigned NOT NULL COMMENT '账户类型(1:个人账户2：企业账户3：商户账户)',
  `daily_amount` bigint(20) unsigned DEFAULT NULL COMMENT '日转账额度',
  `daily_free_amount` bigint(20) unsigned DEFAULT NULL COMMENT '日免手续费额度',
  `each_min_amount` bigint(20) unsigned DEFAULT NULL COMMENT '每笔最低转账金额',
  `each_min_fee` bigint(20) unsigned DEFAULT NULL COMMENT '每笔最低手续费',
  `each_max_fee` bigint(20) unsigned DEFAULT NULL COMMENT '每笔最高手续费',
  `fee_percent` varchar(20) DEFAULT NULL COMMENT '手续费率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='风控-转账规则';

-- ----------------------------
-- Table structure for cru_transfer_bank
-- ----------------------------
DROP TABLE IF EXISTS `cru_transfer_bank`;
CREATE TABLE `cru_transfer_bank` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '转账银行设置id',
  `channel_id` bigint(20) unsigned NOT NULL COMMENT '银行渠道id',
  `fee_percent` varchar(50) NOT NULL COMMENT '手续费率',
  `receive_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '到账时间,0立即到账,其他单位为小时',
  `status` int(10) unsigned NOT NULL DEFAULT '1' COMMENT '状态,1正常2暂停',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `cru_transfer_bank_channel` (`channel_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='风控-转账银行设置';

-- ----------------------------
-- Table structure for cru_withdraw
-- ----------------------------
DROP TABLE IF EXISTS `cru_withdraw`;
CREATE TABLE `cru_withdraw` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '提现规则id',
  `account_type` int(10) unsigned NOT NULL COMMENT '账户类型(1:个人账户2：企业账户3：商户账户)',
  `name` varchar(20) NOT NULL COMMENT '规则名(不再使用)',
  `comment` varchar(50) NOT NULL COMMENT '备注(不再使用)',
  `daily_amount` bigint(20) DEFAULT NULL COMMENT '日提现额度',
  `min_amount` bigint(20) DEFAULT NULL COMMENT '最低提现金额',
  `times` int(11) DEFAULT NULL COMMENT '日提现次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='风控-账号类型提现规则';

-- ----------------------------
-- Table structure for deposit
-- ----------------------------
DROP TABLE IF EXISTS `deposit`;
CREATE TABLE `deposit` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '充值记录id',
  `account_id` bigint(20) NOT NULL COMMENT '账户id',
  `payment_type_id` bigint(20) NOT NULL COMMENT '支付方式id',
  `channel_id` bigint(20) NOT NULL COMMENT '渠道id',
  `pipeline_id` bigint(20) DEFAULT NULL COMMENT '通道ID(充值成功后写入)',
  `out_biz_no` varchar(50) DEFAULT NULL COMMENT '外部业务流水号',
  `occurred_partner_id` bigint(20) NOT NULL COMMENT '流水发生的商户id',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '充值金额',
  `trade_date` date NOT NULL COMMENT '交易日',
  `status` tinyint(4) NOT NULL DEFAULT '3' COMMENT '充值状态,1成功,2失败,3处理中',
  `notify_url` varchar(255) DEFAULT NULL COMMENT '商户的充值成功回调url',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `index_account_id_gmt_create` (`account_id`,`gmt_create`) USING BTREE,
  KEY `index_account_id_amount` (`account_id`,`amount`) USING BTREE,
  KEY `index_partner_id_gmt_create` (`gmt_create`) USING BTREE,
  KEY `index_gmt_create` (`gmt_create`) USING BTREE,
  KEY `payment_type_id` (`payment_type_id`) USING BTREE,
  KEY `channel_id` (`channel_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2015061000000010281 DEFAULT CHARSET=utf8 COMMENT='充值记录表(有状态)';

-- ----------------------------
-- Table structure for deposit_refund
-- ----------------------------
DROP TABLE IF EXISTS `deposit_refund`;
CREATE TABLE `deposit_refund` (
  `id` bigint(20) NOT NULL COMMENT '充值退回id',
  `deposit_id` bigint(20) NOT NULL COMMENT '渠道充值记录id',
  `account_id` bigint(20) DEFAULT NULL COMMENT '账户id',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '渠道id',
  `pipeline_id` bigint(20) DEFAULT NULL COMMENT ' 通道ID',
  `amount` bigint(20) DEFAULT NULL COMMENT '充值金额',
  `trade_date` date DEFAULT NULL COMMENT '交易日',
  `status` tinyint(4) DEFAULT NULL COMMENT '充值退回状态：1成功2失败3处理中',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `deposit_id` (`deposit_id`) USING BTREE,
  KEY `account_id` (`account_id`) USING BTREE,
  KEY `channel_id` (`channel_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='充值退回记录(有状态)';

-- ----------------------------
-- Table structure for id_builder
-- ----------------------------
DROP TABLE IF EXISTS `id_builder`;
CREATE TABLE `id_builder` (
  `id_type` varchar(50) NOT NULL COMMENT 'id类型',
  `id_max_value` bigint(20) unsigned NOT NULL COMMENT 'id值',
  `remark` varchar(100) NOT NULL COMMENT '备注',
  `version_num` bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '版本号',
  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`id_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='主键Id生成器';

-- ----------------------------
-- Table structure for merchants_contacts
-- ----------------------------
DROP TABLE IF EXISTS `merchants_contacts`;
CREATE TABLE `merchants_contacts` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id.',
  `partner_id` bigint(20) NOT NULL COMMENT '商户id',
  `name` varchar(20) DEFAULT NULL COMMENT '联系人姓名',
  `position` varchar(20) DEFAULT NULL COMMENT '联系人职务',
  `address` varchar(100) DEFAULT NULL COMMENT '联系人地址',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
  `tel` varchar(20) DEFAULT NULL COMMENT '电话号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮件',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `merchants_id` (`partner_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户联系人';

-- ----------------------------
-- Table structure for merchant_partner
-- ----------------------------
DROP TABLE IF EXISTS `merchant_partner`;
CREATE TABLE `merchant_partner` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `account_id` bigint(20) DEFAULT NULL COMMENT '关联账户id',
  `service_role_id` bigint(20) NOT NULL COMMENT '关联服务角色ID',
  `name` varchar(20) NOT NULL COMMENT '接入方名称',
  `short_name` varchar(30) DEFAULT NULL COMMENT '接入方简称',
  `site` varchar(30) DEFAULT NULL COMMENT '接入方站点地址',
  `logo_image` varchar(50) DEFAULT NULL COMMENT '接入方logo图片地址',
  `address` varchar(50) DEFAULT NULL COMMENT '接入方地址',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '接入方状态???',
  `protocol_no` varchar(20) DEFAULT '0' COMMENT '协议号',
  `trade_type` varchar(40) DEFAULT '0' COMMENT '支持交易类型???',
  `gmt_cooprate_start` datetime DEFAULT NULL COMMENT '合作开始时间',
  `gmt_cooprate_end` datetime DEFAULT NULL COMMENT '合作结束时间',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  `mobile` varchar(32) DEFAULT NULL COMMENT '接入方联系电话',
  `email` varchar(32) DEFAULT NULL COMMENT '接入方email',
  PRIMARY KEY (`id`),
  KEY `merchant_partner_ibfk_2` (`service_role_id`) USING BTREE,
  KEY `merchant_partner_ibfk_1` (`account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户合作伙伴信息表';

-- ----------------------------
-- Table structure for payment_type
-- ----------------------------
DROP TABLE IF EXISTS `payment_type`;
CREATE TABLE `payment_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '支付方式id',
  `code` varchar(20) DEFAULT NULL COMMENT '支付方式代码',
  `name` varchar(10) NOT NULL COMMENT '支付方式的名称',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='支付方式表';

-- ----------------------------
-- Table structure for payment_type_channel
-- ----------------------------
DROP TABLE IF EXISTS `payment_type_channel`;
CREATE TABLE `payment_type_channel` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `payment_type_id` bigint(20) NOT NULL COMMENT '支付方式',
  `channel_id` bigint(20) NOT NULL COMMENT '支持的渠道id(channel.id)',
  `sort_no` int(11) NOT NULL DEFAULT '0' COMMENT '排序号',
  `status` int(11) DEFAULT '1' COMMENT '状态,1开启,2暂停',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `payment_type_id` (`payment_type_id`) USING BTREE,
  KEY `channel_id` (`channel_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='支付方式绑定渠道关联表';

-- ----------------------------
-- Table structure for pipeline
-- ----------------------------
DROP TABLE IF EXISTS `pipeline`;
CREATE TABLE `pipeline` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `code` varchar(30) NOT NULL COMMENT '通道代号,如(ABC,ALIPAY,WEIPAY,UMPAY)',
  `type` tinyint(4) NOT NULL COMMENT '通道分类:1金融机构(如银行)，2非金融机构(支付宝,联动优势,微信支付等)',
  `name` varchar(50) NOT NULL COMMENT '通道名称',
  `short_name` varchar(50) NOT NULL COMMENT '通道简称',
  `config_content` text COMMENT '渠道配置信息(根据不同渠道自行定义，如托管银行，账号，密码等信息)',
  `start_time` datetime DEFAULT NULL COMMENT '合作开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '合作结束时间',
  `long_time` tinyint(4) NOT NULL DEFAULT '1' COMMENT '长期合作,1是,2否',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '状态:1正常,2暂停',
  `bank_account_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '渠道支持的银行账户类型(0：全部,1:借记卡,2:贷记卡)',
  `internet_bank_type` tinyint(4) NOT NULL COMMENT '渠道支持的网银类型(0:全部;1:个人网银,2:企业网银)',
  `protocol_no` varchar(50) DEFAULT NULL COMMENT '签约协议号，外部通道分配给平台的身份',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8 COMMENT='渠道主表';

-- ----------------------------
-- Table structure for pipeline_bill
-- ----------------------------
DROP TABLE IF EXISTS `pipeline_bill`;
CREATE TABLE `pipeline_bill` (
  `id` bigint(20) NOT NULL COMMENT 'id',
  `account_id` bigint(20) NOT NULL COMMENT '账户id',
  `channel_account` varchar(255) NOT NULL COMMENT '通道账号 (如：银行卡号,支付宝账号,地利宝资金账号；根据channel_id确定)',
  `channel_id` bigint(20) NOT NULL COMMENT '渠道的id',
  `pipeline_id` bigint(20) NOT NULL COMMENT '通道ID',
  `occurred_partner_id` bigint(20) NOT NULL COMMENT '发生的商户ID',
  `biz_num` bigint(20) NOT NULL COMMENT '业务编号id(充值id,提现id,转账id等)',
  `biz_type` bigint(20) NOT NULL DEFAULT '1' COMMENT '业务类型(关联biz_type.id)',
  `type` tinyint(4) NOT NULL COMMENT '流水类型:1收入,2支出',
  `channel_sn` varchar(50) DEFAULT NULL COMMENT '通道流水号(通道返回)',
  `amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '金额，单位：分',
  `trade_date` date NOT NULL COMMENT '记账日(日切相关,对账时使用)',
  `settle_date` date DEFAULT NULL COMMENT '通道返回的对账日期',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '通道流水状态:1处理中,2成功,3失败,4取消',
  `memo` varchar(255) DEFAULT NULL COMMENT '备注',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `channel_bill_ibfk_1` (`channel_id`) USING BTREE,
  KEY `account_id` (`account_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通道收支记录表';

-- ----------------------------
-- Table structure for pipeline_contacts
-- ----------------------------
DROP TABLE IF EXISTS `pipeline_contacts`;
CREATE TABLE `pipeline_contacts` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id.',
  `pipeline_id` bigint(20) NOT NULL COMMENT '通道编号',
  `name` varchar(20) NOT NULL COMMENT '姓名.',
  `position` varchar(20) NOT NULL COMMENT '职务.',
  `address` varchar(100) DEFAULT NULL COMMENT '地址.',
  `mobile` varchar(20) NOT NULL COMMENT '手机.',
  `tel` varchar(20) DEFAULT NULL COMMENT '电话.',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱.',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后更新时间.',
  PRIMARY KEY (`id`),
  KEY `channel_id` (`pipeline_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通道联系人';

-- ----------------------------
-- Table structure for pipeline_notify_info
-- ----------------------------
DROP TABLE IF EXISTS `pipeline_notify_info`;
CREATE TABLE `pipeline_notify_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '渠道支付通知记录',
  `pipeline_bill_id` bigint(20) NOT NULL COMMENT '渠道收支记录id(pipeline.id)',
  `notify_type` tinyint(4) NOT NULL COMMENT '回调类型：1转入(充值)，2转出(提现)',
  `notify_time` datetime NOT NULL COMMENT '通知时间',
  `notify_content` text COMMENT '通道通知参数列表(记录通道回调回转给我们的信息)',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=620 DEFAULT CHARSET=utf8 COMMENT='通道回调信息记录表';

-- ----------------------------
-- Table structure for pipeline_router
-- ----------------------------
DROP TABLE IF EXISTS `pipeline_router`;
CREATE TABLE `pipeline_router` (
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通道路由表';

-- ----------------------------
-- Table structure for service_resource
-- ----------------------------
DROP TABLE IF EXISTS `service_resource`;
CREATE TABLE `service_resource` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `key` varchar(50) NOT NULL COMMENT '服务key',
  `name` varchar(50) DEFAULT '' COMMENT '服务名',
  `description` varchar(256) DEFAULT '' COMMENT '服务描述',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改时间',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据的版本号',
  `sync_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '数据的同步状态',
  `sync_time` datetime DEFAULT NULL COMMENT '最近一次同步数据的时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_uniq_key` (`key`) USING BTREE,
  KEY `index_gmt_create` (`gmt_create`) USING BTREE,
  KEY `index_name_key` (`name`,`key`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='平台开放服务(资源)表';

-- ----------------------------
-- Table structure for service_role
-- ----------------------------
DROP TABLE IF EXISTS `service_role`;
CREATE TABLE `service_role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL COMMENT '角色名称',
  `memo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='平台开放服务-角色定义';

-- ----------------------------
-- Table structure for service_role_res
-- ----------------------------
DROP TABLE IF EXISTS `service_role_res`;
CREATE TABLE `service_role_res` (
  `id` bigint(20) NOT NULL,
  `service_role_id` bigint(20) NOT NULL COMMENT '角色ID',
  `service_res_id` bigint(20) NOT NULL COMMENT '服务ID',
  PRIMARY KEY (`id`),
  KEY `service_role_id` (`service_role_id`) USING BTREE,
  KEY `service_id` (`service_res_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='平台开放服务-角色关联表';

-- ----------------------------
-- Table structure for trade
-- ----------------------------
DROP TABLE IF EXISTS `trade`;
CREATE TABLE `trade` (
  `id` bigint(20) unsigned NOT NULL COMMENT '交易号',
  `name` varchar(200) NOT NULL COMMENT '交易名称',
  `partner_id` bigint(20) NOT NULL COMMENT '交易商户的id',
  `out_trade_no` varchar(50) NOT NULL COMMENT '商户的外部交易号(如订单号)',
  `buyer_account_id` bigint(20) NOT NULL COMMENT '支付账户(account .id)',
  `seller_account_id` bigint(20) NOT NULL COMMENT '收款账户(account .id)',
  `trade_type` tinyint(4) NOT NULL COMMENT '交易类型(关联trade_type.id)',
  `amount` bigint(20) unsigned NOT NULL COMMENT '交易金额,单位:分',
  `occur_amount` bigint(20) unsigned DEFAULT NULL COMMENT '交易实际成交金额',
  `show_url` varchar(256) DEFAULT NULL COMMENT '交易的商品展示url',
  `return_url` varchar(256) DEFAULT NULL COMMENT '支付完成后返回到商户系统的url',
  `notify_url` varchar(256) DEFAULT NULL COMMENT '商户的交易同步的url',
  `goods_picture_url` varchar(256) DEFAULT NULL COMMENT '交易商品图片url',
  `pay_time` datetime DEFAULT NULL COMMENT '付款时间',
  `send_goods_time` datetime DEFAULT NULL COMMENT '卖家发货时间',
  `finish_time` datetime DEFAULT NULL COMMENT '交易结束时间',
  `status` tinyint(4) NOT NULL COMMENT '交易状态',
  `pay_cost_items` varchar(1000) DEFAULT NULL COMMENT '支付其它费用集合(格式:付款方1^收款方1^金额1^费用明目1|付款方2^收款方2^金额2^费用明目2)',
  `comment` varchar(100) DEFAULT NULL COMMENT '备注',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  `reserved` varchar(256) DEFAULT NULL COMMENT '扩展字段 json格式',
  PRIMARY KEY (`id`),
  UNIQUE KEY `partner_out_trade_no_index` (`partner_id`,`out_trade_no`) USING BTREE,
  UNIQUE KEY `index_partner_id_out_trade_no` (`partner_id`,`out_trade_no`) USING BTREE,
  KEY `index_buyer_account_gmt_create` (`buyer_account_id`,`gmt_create`) USING BTREE,
  KEY `index_seller_account_gmt_create` (`seller_account_id`,`gmt_create`) USING BTREE,
  KEY `index_out_trade_no_gmt_create` (`out_trade_no`,`gmt_create`) USING BTREE,
  KEY `index_gmt_create` (`gmt_create`) USING BTREE,
  KEY `index_amount` (`amount`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易业务主表(有状态)';

-- ----------------------------
-- Table structure for trade_payment
-- ----------------------------
DROP TABLE IF EXISTS `trade_payment`;
CREATE TABLE `trade_payment` (
  `id` bigint(20) NOT NULL COMMENT '支付记录id',
  `trade_id` bigint(20) NOT NULL COMMENT '关联交易号ID(trade.id)',
  `src_account_id` bigint(20) NOT NULL COMMENT '付款账户(account.id)',
  `des_account_id` bigint(20) NOT NULL COMMENT '收款账户(account.id)',
  `amount` bigint(20) NOT NULL COMMENT '支付总额',
  `used_balance` bigint(20) DEFAULT '0' COMMENT '使用的余额额度',
  `used_credit` bigint(20) DEFAULT '0' COMMENT '使用信用余额',
  `trade_date` date DEFAULT NULL COMMENT '交易日',
  `comment` varchar(50) DEFAULT NULL COMMENT '付款备注',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '状态:1待付款,2付款成功,3付款失败',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易的支付记录表(有状态)';

-- ----------------------------
-- Table structure for trade_payment_detail
-- ----------------------------
DROP TABLE IF EXISTS `trade_payment_detail`;
CREATE TABLE `trade_payment_detail` (
  `id` bigint(20) NOT NULL COMMENT '支付记录详情id',
  `trade_id` bigint(20) NOT NULL COMMENT '关联交易号ID(trade.id)',
  `payment_id` bigint(20) NOT NULL COMMENT '支付记录id',
  `channel_account` varchar(100) NOT NULL COMMENT '渠道(支付)账号(地利宝账号，支付宝账号，微信账号，银行卡等)',
  `channel_id` bigint(20) NOT NULL COMMENT '渠道id(channel.id)',
  `pipeline_id` bigint(20) DEFAULT NULL COMMENT '通道ID',
  `channel_name` varchar(50) NOT NULL COMMENT '退款渠道名称(冗余)',
  `amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '金额',
  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '状态:1待付款,2付款成功,3付款失败',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易的支付记录详情';

-- ----------------------------
-- Table structure for trade_refund
-- ----------------------------
DROP TABLE IF EXISTS `trade_refund`;
CREATE TABLE `trade_refund` (
  `id` bigint(20) unsigned NOT NULL COMMENT '退款编号',
  `trade_id` bigint(20) unsigned NOT NULL COMMENT '交易号',
  `occurred_partner_id` bigint(20) unsigned DEFAULT NULL COMMENT '发生的商户Id',
  `refund_account_id` bigint(20) unsigned DEFAULT NULL COMMENT '退款方(account_id)',
  `payee_account_id` bigint(20) unsigned DEFAULT NULL COMMENT '收款方(account_id)',
  `refund_name` varchar(100) DEFAULT NULL COMMENT '退款名称',
  `refund_amount` bigint(20) unsigned NOT NULL COMMENT '退款金额',
  `refund_status` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '退款状态(1:已受理,2:处理中,3:失败,0:已退款)',
  `gmt_create` datetime NOT NULL COMMENT '创建时间(退款申请时间)',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易退款表(有状态)';

-- ----------------------------
-- Table structure for trade_refund_detail
-- ----------------------------
DROP TABLE IF EXISTS `trade_refund_detail`;
CREATE TABLE `trade_refund_detail` (
  `id` bigint(20) unsigned NOT NULL COMMENT '退款明细id',
  `trade_id` bigint(20) NOT NULL COMMENT '关联交易号ID(trade.id)',
  `pament_id` bigint(20) NOT NULL COMMENT '关联交易支付ID',
  `refund_id` bigint(20) unsigned NOT NULL COMMENT '交易退款id',
  `refund_account_id` bigint(20) unsigned NOT NULL COMMENT '退款账户id(冗余)',
  `refund_name` varchar(100) NOT NULL COMMENT '退款名称(冗余)',
  `refund_amount` bigint(20) unsigned NOT NULL COMMENT '退款金额',
  `refund_channel_id` bigint(20) unsigned NOT NULL COMMENT '退款渠道id',
  `refund_channel_name` varchar(50) NOT NULL COMMENT '退款渠道名称(冗余)',
  `refund_pipeline_id` bigint(20) DEFAULT NULL COMMENT '通道id',
  `refund_status` tinyint(4) unsigned NOT NULL DEFAULT '1' COMMENT '退款状态(1:已受理,2:处理中,3:失败,0:成功)',
  `error_reason` varchar(200) DEFAULT NULL COMMENT '失败原因',
  `gmt_sumbit_channel` datetime DEFAULT NULL COMMENT '提交渠道处理时间',
  `gmt_create` datetime NOT NULL COMMENT '创建时间(退款申请时间)',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易退款明细表(有状态)';

-- ----------------------------
-- Table structure for trade_status_notify
-- ----------------------------
DROP TABLE IF EXISTS `trade_status_notify`;
CREATE TABLE `trade_status_notify` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '交易状态同步通知id',
  `trade_id` bigint(20) NOT NULL COMMENT '交易号',
  `out_trade_no` varchar(30) NOT NULL COMMENT '外部系统交易号',
  `type` tinyint(4) NOT NULL COMMENT '通知类型(1:支付通知；2:关闭通知；3；完成通知)',
  `pay_amount` bigint(20) DEFAULT NULL COMMENT '支付金额(支付通知使用)',
  `notify_url` varchar(256) NOT NULL COMMENT '异步通知url',
  `trade_status` tinyint(4) NOT NULL COMMENT '交易的状态',
  `trade_status_alter_time` datetime NOT NULL COMMENT '交易状态改变时间',
  `notify_time` datetime DEFAULT NULL COMMENT '最近一次同步的时间',
  `status` tinyint(4) DEFAULT '1' COMMENT '通知状态：1，待同步；2，待重试；3，已同步;4:同步中',
  `fail_reason` varchar(200) DEFAULT NULL COMMENT '通知失败的错误原因',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  `reserved` varchar(256) DEFAULT NULL COMMENT '扩展字段 json格式',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=756 DEFAULT CHARSET=utf8 COMMENT='交易状态的通知记录表';

-- ----------------------------
-- Table structure for trade_type
-- ----------------------------
DROP TABLE IF EXISTS `trade_type`;
CREATE TABLE `trade_type` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(50) NOT NULL COMMENT '类型编码',
  `name` varchar(50) NOT NULL COMMENT '类型名称',
  `icon_address` varchar(100) DEFAULT NULL COMMENT '类型图标存放全路径',
  `payment_type_ids` varchar(50) NOT NULL COMMENT '支持的支付方式(多种支付方式以逗号","隔开)',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='交易类型表';

-- ----------------------------
-- Table structure for transfer
-- ----------------------------
DROP TABLE IF EXISTS `transfer`;
CREATE TABLE `transfer` (
  `id` bigint(20) NOT NULL COMMENT '转账id',
  `src_account_id` bigint(20) NOT NULL COMMENT '转出方id',
  `des_account_id` bigint(20) NOT NULL COMMENT '转入方id',
  `out_biz_no` varchar(50) DEFAULT NULL COMMENT '外部业务流水号',
  `occurred_partner_id` bigint(20) NOT NULL COMMENT '流水发生的商户id',
  `amount` bigint(20) NOT NULL DEFAULT '0' COMMENT '转账金额',
  `notify_url` varchar(255) DEFAULT NULL COMMENT '商户的充值成功回调url',
  `trade_date` date DEFAULT NULL COMMENT '交易日',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='转账(账户间)主表';

-- ----------------------------
-- Table structure for transfer_account_history
-- ----------------------------
DROP TABLE IF EXISTS `transfer_account_history`;
CREATE TABLE `transfer_account_history` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '转账历史账户表Id(主键)',
  `fromAccountId` bigint(20) NOT NULL COMMENT '转出账户id',
  `toAccountId` bigint(20) NOT NULL COMMENT '转入账户id',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `transfer_account_history_account` (`fromAccountId`,`toAccountId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='转账账户历史表';

-- ----------------------------
-- Table structure for withdraw
-- ----------------------------
DROP TABLE IF EXISTS `withdraw`;
CREATE TABLE `withdraw` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '提款记录id',
  `account_id` bigint(20) NOT NULL COMMENT '提款账号id',
  `out_biz_no` varchar(50) DEFAULT NULL COMMENT '外部业务流水号',
  `occurred_partner_id` bigint(20) NOT NULL COMMENT '流水发生的商户id',
  `payment_type_id` bigint(20) DEFAULT NULL COMMENT '支付方式id',
  `channel_type_id` bigint(20) NOT NULL COMMENT '渠道支付记录',
  `channel_id` bigint(20) DEFAULT NULL COMMENT '通道ID',
  `bank_name` varchar(50) DEFAULT NULL COMMENT '银行名称',
  `bank_customer_name` varchar(50) DEFAULT NULL COMMENT '银行卡开户名',
  `bank_number` varchar(25) DEFAULT NULL COMMENT '银行卡号',
  `name` varchar(50) DEFAULT NULL COMMENT '名称/备注',
  `amount` bigint(20) NOT NULL COMMENT '取款金额',
  `status` tinyint(4) NOT NULL DEFAULT '3' COMMENT '提现状态,1成功,2失败,3平台处理中,4银行处理中',
  `notify_url` varchar(255) DEFAULT NULL COMMENT '商户的充值成功回调url',
  `trade_date` date NOT NULL COMMENT '交易日',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  KEY `index_account_id_gmt_create` (`account_id`,`gmt_create`) USING BTREE,
  KEY `index_account_id_amount` (`account_id`,`amount`) USING BTREE,
  KEY `index_partner_id_gmt_create` (`gmt_create`) USING BTREE,
  KEY `index_gmt_create` (`gmt_create`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2015031300000170285 DEFAULT CHARSET=utf8 COMMENT='提现记录表(有状态)';

-- ----------------------------
-- Table structure for withdraw_bankcard_history
-- ----------------------------
DROP TABLE IF EXISTS `withdraw_bankcard_history`;
CREATE TABLE `withdraw_bankcard_history` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '（转账银行卡历史Id）主键',
  `account_id` bigint(20) NOT NULL COMMENT '转出地利宝账户id',
  `channel_id` bigint(20) unsigned NOT NULL COMMENT '银行卡对应的银行渠道Id',
  `bank_card_number` varchar(50) NOT NULL COMMENT '银行卡号',
  `bank_account_name` varchar(50) NOT NULL COMMENT '银行卡账户名',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `transfer_bankcard_history_card` (`account_id`,`bank_card_number`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='提现银行卡历史表';
