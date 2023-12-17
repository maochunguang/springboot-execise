package com.mcg.exercise.dao;

import com.mcg.exercise.entity.HouseInfo;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class HouseDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public static final House house = new House();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.id")
    public static final SqlColumn<Long> id = house.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.house_address")
    public static final SqlColumn<String> houseAddress = house.houseAddress;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.house_info")
    public static final SqlColumn<HouseInfo> houseInfo = house.houseInfo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.community_name")
    public static final SqlColumn<String> communityName = house.communityName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.create_time")
    public static final SqlColumn<Date> createTime = house.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: house.update_time")
    public static final SqlColumn<Date> updateTime = house.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    public static final class House extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> houseAddress = column("house_address", JDBCType.VARCHAR);

        public final SqlColumn<HouseInfo> houseInfo = column("house_info", JDBCType.VARCHAR, "com.mcg.exercise.extension.mybatis.JacksonTypeHandler");

        public final SqlColumn<String> communityName = column("community_name", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public House() {
            super("house");
        }
    }
}