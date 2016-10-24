package com.xhyan.zero.common.config.mybaits;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 数据源自动配置
 */
@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix="datasource.druid")
    public DataSource dataSource()	{
        return	DataSourceBuilder.create().build();
    }
}
