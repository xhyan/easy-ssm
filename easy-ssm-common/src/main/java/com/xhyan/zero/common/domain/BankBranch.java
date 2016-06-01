package com.xhyan.zero.common.domain;

import javax.persistence.*;

@Table(name = "bank_branch")
public class BankBranch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 银行的分支行号
     */
    @Column(name = "bank_no")
    private String bankNo;

    /**
     * 银行编号
     */
    @Column(name = "bank_code")
    private Integer bankCode;

    /**
     * 地区编号
     */
    @Column(name = "city_code")
    private Integer cityCode;

    /**
     * 分支行清算行号
     */
    @Column(name = "clear_bank_no")
    private String clearBankNo;

    /**
     * 分支行名称
     */
    @Column(name = "bank_name")
    private String bankName;

    private Boolean status;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取银行的分支行号
     *
     * @return bank_no - 银行的分支行号
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * 设置银行的分支行号
     *
     * @param bankNo 银行的分支行号
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    /**
     * 获取银行编号
     *
     * @return bank_code - 银行编号
     */
    public Integer getBankCode() {
        return bankCode;
    }

    /**
     * 设置银行编号
     *
     * @param bankCode 银行编号
     */
    public void setBankCode(Integer bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 获取地区编号
     *
     * @return city_code - 地区编号
     */
    public Integer getCityCode() {
        return cityCode;
    }

    /**
     * 设置地区编号
     *
     * @param cityCode 地区编号
     */
    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 获取分支行清算行号
     *
     * @return clear_bank_no - 分支行清算行号
     */
    public String getClearBankNo() {
        return clearBankNo;
    }

    /**
     * 设置分支行清算行号
     *
     * @param clearBankNo 分支行清算行号
     */
    public void setClearBankNo(String clearBankNo) {
        this.clearBankNo = clearBankNo;
    }

    /**
     * 获取分支行名称
     *
     * @return bank_name - 分支行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置分支行名称
     *
     * @param bankName 分支行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}