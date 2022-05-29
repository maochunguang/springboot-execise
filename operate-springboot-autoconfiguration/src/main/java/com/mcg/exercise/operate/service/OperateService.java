package com.mcg.exercise.operate.service;

/**
 * @author maocg
 * @date 2022-05-29 10:22
 */
public class OperateService {
    private String scanPackage;
    private String operateName;


    public OperateService(String scanPackage, String operateName) {
        this.scanPackage = scanPackage;
        this.operateName = operateName;
    }

    public void operateLog() {
        System.out.println("scanPackage:" + scanPackage + " ,operateName:" + operateName);
    }

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
