package com.xhyan.zero.common.domain;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Data
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
}