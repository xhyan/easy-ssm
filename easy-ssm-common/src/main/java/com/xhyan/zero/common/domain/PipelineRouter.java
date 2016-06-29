package com.xhyan.zero.common.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "pipeline_router")
public class PipelineRouter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}