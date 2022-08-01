package com.mcg.exercise.operate.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author maocg
 * @date 2022-05-29 10:17
 */
@ConfigurationProperties(prefix = "operate")
public class OperateProperties {
    private String scanPackage;
    private String operateName;

    public String getScanPackage() {
        return scanPackage;
    }

    public void setScanPackage(String scanPackage) {
        this.scanPackage = scanPackage;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }
}
