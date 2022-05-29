package com.mcg.exercise.operate.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author maocg
 * @date 2022-05-29 10:17
 */
@ConfigurationProperties(prefix = "operate")
@Data
public class OperateProperties {
    private String scanPackage;
    private String operateName;
}
