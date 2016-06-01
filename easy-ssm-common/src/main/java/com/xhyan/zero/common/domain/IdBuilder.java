package com.xhyan.zero.common.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "id_builder")
public class IdBuilder {
    /**
     * id类型
     */
    @Id
    @Column(name = "id_type")
    private String idType;

    /**
     * id值
     */
    @Column(name = "id_max_value")
    private Long idMaxValue;

    /**
     * 备注
     */
    private String remark;

    /**
     * 版本号
     */
    @Column(name = "version_num")
    private Long versionNum;

    /**
     * 最后修改时间
     */
    @Column(name = "gmt_modify")
    private Date gmtModify;

    /**
     * 获取id类型
     *
     * @return id_type - id类型
     */
    public String getIdType() {
        return idType;
    }

    /**
     * 设置id类型
     *
     * @param idType id类型
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * 获取id值
     *
     * @return id_max_value - id值
     */
    public Long getIdMaxValue() {
        return idMaxValue;
    }

    /**
     * 设置id值
     *
     * @param idMaxValue id值
     */
    public void setIdMaxValue(Long idMaxValue) {
        this.idMaxValue = idMaxValue;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取版本号
     *
     * @return version_num - 版本号
     */
    public Long getVersionNum() {
        return versionNum;
    }

    /**
     * 设置版本号
     *
     * @param versionNum 版本号
     */
    public void setVersionNum(Long versionNum) {
        this.versionNum = versionNum;
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