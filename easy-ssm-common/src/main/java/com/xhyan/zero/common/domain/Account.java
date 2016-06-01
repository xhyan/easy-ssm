package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account")
public class Account {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 登录密码(不可逆加密)
     */
    @Column(name = "login_pwd")
    private String loginPwd;

    /**
     * 交易密码(不可逆加密)
     */
    @Column(name = "trade_pwd")
    private String tradePwd;

    /**
     *  账号绑定邮箱
     */
    private String email;

    /**
     *  账号绑定备用邮箱
     */
    @Column(name = "email_backup")
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
     * 支付功能控制标志？？？
     */
    @Column(name = "pay_flag")
    private Long payFlag;

    /**
     * 账户状态：1正常,2受限,3冻结,4注销
     */
    private Byte status;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    @Column(name = "gmt_modify")
    private Date gmtModify;

    /**
     * 扩展字段
     */
    private String extend;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取登录名
     *
     * @return login_name - 登录名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录名
     *
     * @param loginName 登录名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取登录密码(不可逆加密)
     *
     * @return login_pwd - 登录密码(不可逆加密)
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * 设置登录密码(不可逆加密)
     *
     * @param loginPwd 登录密码(不可逆加密)
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    /**
     * 获取交易密码(不可逆加密)
     *
     * @return trade_pwd - 交易密码(不可逆加密)
     */
    public String getTradePwd() {
        return tradePwd;
    }

    /**
     * 设置交易密码(不可逆加密)
     *
     * @param tradePwd 交易密码(不可逆加密)
     */
    public void setTradePwd(String tradePwd) {
        this.tradePwd = tradePwd;
    }

    /**
     * 获取 账号绑定邮箱
     *
     * @return email -  账号绑定邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 账号绑定邮箱
     *
     * @param email  账号绑定邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取 账号绑定备用邮箱
     *
     * @return email_backup -  账号绑定备用邮箱
     */
    public String getEmailBackup() {
        return emailBackup;
    }

    /**
     * 设置 账号绑定备用邮箱
     *
     * @param emailBackup  账号绑定备用邮箱
     */
    public void setEmailBackup(String emailBackup) {
        this.emailBackup = emailBackup;
    }

    /**
     * 获取账号绑定手机号
     *
     * @return mobile - 账号绑定手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置账号绑定手机号
     *
     * @param mobile 账号绑定手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取账户类型(1个人账户；2企业账户)
     *
     * @return type - 账户类型(1个人账户；2企业账户)
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置账户类型(1个人账户；2企业账户)
     *
     * @param type 账户类型(1个人账户；2企业账户)
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取账户性质（1资金账户，3商户账户，4担保账户）
     *
     * @return property - 账户性质（1资金账户，3商户账户，4担保账户）
     */
    public Byte getProperty() {
        return property;
    }

    /**
     * 设置账户性质（1资金账户，3商户账户，4担保账户）
     *
     * @param property 账户性质（1资金账户，3商户账户，4担保账户）
     */
    public void setProperty(Byte property) {
        this.property = property;
    }

    /**
     * 获取支付功能控制标志？？？
     *
     * @return pay_flag - 支付功能控制标志？？？
     */
    public Long getPayFlag() {
        return payFlag;
    }

    /**
     * 设置支付功能控制标志？？？
     *
     * @param payFlag 支付功能控制标志？？？
     */
    public void setPayFlag(Long payFlag) {
        this.payFlag = payFlag;
    }

    /**
     * 获取账户状态：1正常,2受限,3冻结,4注销
     *
     * @return status - 账户状态：1正常,2受限,3冻结,4注销
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置账户状态：1正常,2受限,3冻结,4注销
     *
     * @param status 账户状态：1正常,2受限,3冻结,4注销
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取最后修改时间
     *
     * @return gmt_modify - 最后修改时间
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * 设置最后修改时间
     *
     * @param gmtModify 最后修改时间
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * 获取扩展字段
     *
     * @return extend - 扩展字段
     */
    public String getExtend() {
        return extend;
    }

    /**
     * 设置扩展字段
     *
     * @param extend 扩展字段
     */
    public void setExtend(String extend) {
        this.extend = extend;
    }
}