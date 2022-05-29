package com.mcg.exercise.utils;

import java.util.UUID;

/**
 * @author mao
 * @date 2021/2/13
 * @description
 */
public class DsIdUtils {
    public static String getUuid() {
        return UUID.randomUUID().toString();
    }
}
