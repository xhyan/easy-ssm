package com.xhyan.zero.common.domain;

import javax.persistence.*;

@Table(name = "service_role_res")
public class ServiceRoleRes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色ID
     */
    @Column(name = "service_role_id")
    private Long serviceRoleId;

    /**
     * 服务ID
     */
    @Column(name = "service_res_id")
    private Long serviceResId;

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
     * 获取角色ID
     *
     * @return service_role_id - 角色ID
     */
    public Long getServiceRoleId() {
        return serviceRoleId;
    }

    /**
     * 设置角色ID
     *
     * @param serviceRoleId 角色ID
     */
    public void setServiceRoleId(Long serviceRoleId) {
        this.serviceRoleId = serviceRoleId;
    }

    /**
     * 获取服务ID
     *
     * @return service_res_id - 服务ID
     */
    public Long getServiceResId() {
        return serviceResId;
    }

    /**
     * 设置服务ID
     *
     * @param serviceResId 服务ID
     */
    public void setServiceResId(Long serviceResId) {
        this.serviceResId = serviceResId;
    }
}