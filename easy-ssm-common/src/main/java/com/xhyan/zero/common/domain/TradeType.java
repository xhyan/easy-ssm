package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "trade_type")
public class TradeType {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类型编码
     */
    private String code;

    /**
     * 类型名称
     */
    private String name;

    /**
     * 类型图标存放全路径
     */
    @Column(name = "icon_address")
    private String iconAddress;

    /**
     * 支持的支付方式(多种支付方式以逗号","隔开)
     */
    @Column(name = "payment_type_ids")
    private String paymentTypeIds;

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
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取类型编码
     *
     * @return code - 类型编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置类型编码
     *
     * @param code 类型编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取类型名称
     *
     * @return name - 类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置类型名称
     *
     * @param name 类型名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取类型图标存放全路径
     *
     * @return icon_address - 类型图标存放全路径
     */
    public String getIconAddress() {
        return iconAddress;
    }

    /**
     * 设置类型图标存放全路径
     *
     * @param iconAddress 类型图标存放全路径
     */
    public void setIconAddress(String iconAddress) {
        this.iconAddress = iconAddress;
    }

    /**
     * 获取支持的支付方式(多种支付方式以逗号","隔开)
     *
     * @return payment_type_ids - 支持的支付方式(多种支付方式以逗号","隔开)
     */
    public String getPaymentTypeIds() {
        return paymentTypeIds;
    }

    /**
     * 设置支持的支付方式(多种支付方式以逗号","隔开)
     *
     * @param paymentTypeIds 支持的支付方式(多种支付方式以逗号","隔开)
     */
    public void setPaymentTypeIds(String paymentTypeIds) {
        this.paymentTypeIds = paymentTypeIds;
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
}