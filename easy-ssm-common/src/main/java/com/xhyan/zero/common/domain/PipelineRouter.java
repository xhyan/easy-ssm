package com.xhyan.zero.common.domain;

import javax.persistence.*;

@Table(name = "pipeline_router")
public class PipelineRouter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
}