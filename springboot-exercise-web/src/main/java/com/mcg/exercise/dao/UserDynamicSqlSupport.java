package com.mcg.exercise.dao;

import java.sql.JDBCType;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.id")
    public static final SqlColumn<Long> id = user.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.user_nick")
    public static final SqlColumn<String> userNick = user.userNick;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.login_name")
    public static final SqlColumn<String> loginName = user.loginName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.password")
    public static final SqlColumn<String> password = user.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.description")
    public static final SqlColumn<String> description = user.description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.tags")
    public static final SqlColumn<List> tags = user.tags;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.avatar_url")
    public static final SqlColumn<String> avatarUrl = user.avatarUrl;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.create_time")
    public static final SqlColumn<Date> createTime = user.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.update_time")
    public static final SqlColumn<Date> updateTime = user.updateTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> userNick = column("user_nick", JDBCType.VARCHAR);

        public final SqlColumn<String> loginName = column("login_name", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<List> tags = column("tags", JDBCType.VARCHAR, "com.mcg.exercise.extension.mybatis.StringToListTypeHandler");

        public final SqlColumn<String> avatarUrl = column("avatar_url", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public User() {
            super("user");
        }
    }
}