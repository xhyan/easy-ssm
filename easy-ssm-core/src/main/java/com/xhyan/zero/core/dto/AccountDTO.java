package com.xhyan.zero.core.dto;

import com.xhyan.zero.common.base.BaseDTO;
import lombok.Data;

import javax.persistence.Column;

/**
 * 账户信息dto对象
 */
@Data
public class AccountDTO extends BaseDTO{

    private static final long serialVersionUID = -6155412062740634175L;
    /**
     * 登录名
     */
    private String loginName;
    /**
     * 登录密码(不可逆加密)
     */
    private String loginPwd;
    /**
     * 交易密码(不可逆加密)
     */
    private String tradePwd;
    /**
     * 账号绑定邮箱
     */
    private String email;
    /**
     * 账号绑定备用邮箱
     */
    private String emailBackup;
    /**
     * 账号绑定手机号
     */
    private String mobile;

    /**
     * 账户类型(1个人账户；2企业账户)
     */
    private Byte type;
    /**
     * 账户性质（1资金账户，3商户账户，4担保账户）
     */
    private Byte property;
    /**
     * 支付功能控制标志
     */
    private Long payFlag;
    /**
     * 账户状态：1正常,2受限,3冻结,4注销
     */
    private Byte status;
    /**
     * 扩展字段
     */
    private String extend;
}
