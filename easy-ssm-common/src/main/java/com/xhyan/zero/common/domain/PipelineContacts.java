package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pipeline_contacts")
public class PipelineContacts {
    /**
     * id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 通道编号
     */
    @Column(name = "pipeline_id")
    private Long pipelineId;

    /**
     * 姓名.
     */
    private String name;

    /**
     * 职务.
     */
    private String position;

    /**
     * 地址.
     */
    private String address;

    /**
     * 手机.
     */
    private String mobile;

    /**
     * 电话.
     */
    private String tel;

    /**
     * 邮箱.
     */
    private String email;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 最后更新时间.
     */
    @Column(name = "gmt_modify")
    private Date gmtModify;

    /**
     * 获取id.
     *
     * @return id - id.
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id.
     *
     * @param id id.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取通道编号
     *
     * @return pipeline_id - 通道编号
     */
    public Long getPipelineId() {
        return pipelineId;
    }

    /**
     * 设置通道编号
     *
     * @param pipelineId 通道编号
     */
    public void setPipelineId(Long pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * 获取姓名.
     *
     * @return name - 姓名.
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名.
     *
     * @param name 姓名.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取职务.
     *
     * @return position - 职务.
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置职务.
     *
     * @param position 职务.
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取地址.
     *
     * @return address - 地址.
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址.
     *
     * @param address 地址.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取手机.
     *
     * @return mobile - 手机.
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机.
     *
     * @param mobile 手机.
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取电话.
     *
     * @return tel - 电话.
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话.
     *
     * @param tel 电话.
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取邮箱.
     *
     * @return email - 邮箱.
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱.
     *
     * @param email 邮箱.
     */
    public void setEmail(String email) {
        this.email = email;
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
     * 获取最后更新时间.
     *
     * @return gmt_modify - 最后更新时间.
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * 设置最后更新时间.
     *
     * @param gmtModify 最后更新时间.
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}