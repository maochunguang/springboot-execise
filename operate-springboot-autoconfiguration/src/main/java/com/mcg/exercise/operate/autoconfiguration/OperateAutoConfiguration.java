package com.mcg.exercise.operate.autoconfiguration;

import com.mcg.exercise.operate.config.OperateProperties;
import com.mcg.exercise.operate.service.OperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 引入配置文件类
@EnableConfigurationProperties(OperateProperties.class)
// 只有在配置了demo的配置信息时，才进行加载
@ConditionalOnProperty(prefix = "operate", value = "scanPackage")
public class OperateAutoConfiguration {

    @Autowired
    private OperateProperties properties;

    @Bean
    public OperateService operateService() {
        return new OperateService(properties.getScanPackage(), properties.getOperateName());
    }
}