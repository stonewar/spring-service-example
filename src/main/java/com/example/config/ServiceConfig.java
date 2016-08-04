package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.example.model.config.ModelConfig;

/**
 * 
 * @author yandypiedra
 *
 */
@Configuration
@ComponentScan(basePackages="com.example.service")
@Import(ModelConfig.class)
public class ServiceConfig {}
