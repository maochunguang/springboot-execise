package com.mcg.exercise.entity;

import java.util.Date;
import javax.annotation.Generated;

public class House {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.house_address")
    private String houseAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.house_info")
    private HouseInfo houseInfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.express_info")
    private ExpressInfo expressInfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.community_name")
    private String communityName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.street_name")
    private String streetName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.update_time")
    private Date updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public House withId(Long id) {
        this.setId(id);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.house_address")
    public String getHouseAddress() {
        return houseAddress;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public House withHouseAddress(String houseAddress) {
        this.setHouseAddress(houseAddress);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.house_address")
    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress == null ? null : houseAddress.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.house_info")
    public HouseInfo getHouseInfo() {
        return houseInfo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public House withHouseInfo(HouseInfo houseInfo) {
        this.setHouseInfo(houseInfo);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.house_info")
    public void setHouseInfo(HouseInfo houseInfo) {
        this.houseInfo = houseInfo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.express_info")
    public ExpressInfo getExpressInfo() {
        return expressInfo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public House withExpressInfo(ExpressInfo expressInfo) {
        this.setExpressInfo(expressInfo);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.express_info")
    public void setExpressInfo(ExpressInfo expressInfo) {
        this.expressInfo = expressInfo;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.community_name")
    public String getCommunityName() {
        return communityName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public House withCommunityName(String communityName) {
        this.setCommunityName(communityName);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.community_name")
    public void setCommunityName(String communityName) {
        this.communityName = communityName == null ? null : communityName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.street_name")
    public String getStreetName() {
        return streetName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public House withStreetName(String streetName) {
        this.setStreetName(streetName);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.street_name")
    public void setStreetName(String streetName) {
        this.streetName = streetName == null ? null : streetName.trim();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public House withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public House withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.update_time")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        House other = (House) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHouseAddress() == null ? other.getHouseAddress() == null : this.getHouseAddress().equals(other.getHouseAddress()))
            && (this.getHouseInfo() == null ? other.getHouseInfo() == null : this.getHouseInfo().equals(other.getHouseInfo()))
            && (this.getExpressInfo() == null ? other.getExpressInfo() == null : this.getExpressInfo().equals(other.getExpressInfo()))
            && (this.getCommunityName() == null ? other.getCommunityName() == null : this.getCommunityName().equals(other.getCommunityName()))
            && (this.getStreetName() == null ? other.getStreetName() == null : this.getStreetName().equals(other.getStreetName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHouseAddress() == null) ? 0 : getHouseAddress().hashCode());
        result = prime * result + ((getHouseInfo() == null) ? 0 : getHouseInfo().hashCode());
        result = prime * result + ((getExpressInfo() == null) ? 0 : getExpressInfo().hashCode());
        result = prime * result + ((getCommunityName() == null) ? 0 : getCommunityName().hashCode());
        result = prime * result + ((getStreetName() == null) ? 0 : getStreetName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", houseAddress=").append(houseAddress);
        sb.append(", houseInfo=").append(houseInfo);
        sb.append(", expressInfo=").append(expressInfo);
        sb.append(", communityName=").append(communityName);
        sb.append(", streetName=").append(streetName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}