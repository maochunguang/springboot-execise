package com.mcg.exercise.extension;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author mao
 * @date 2021/1/17
 * @description 数据源切换
 */
public class DynamicDataSourceContextHolder {
    public static final Logger log = LoggerFactory.getLogger(DynamicDataSourceContextHolder.class);

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static String getDataSourceType() {
        return CONTEXT_HOLDER.get();
    }

    public static void setDataSourceType(String dataSourceType) {
        log.info("切换数据源到{}", dataSourceType);
        CONTEXT_HOLDER.set(dataSourceType);
    }

    public static void clearDataSourceType() {
        CONTEXT_HOLDER.remove();
    }
}
