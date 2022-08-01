package com.mcg.exercise.extension.mybatis;


import com.alibaba.fastjson.JSON;
import com.mcg.exercise.entity.HouseInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * json自定义解析
 *
 * @author maocg
 * @date 2022-07-31 17:22
 */
@Slf4j
//@MappedTypes(value = {HouseInfo.class})
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyFastJsonTypeHandler<T> extends BaseTypeHandler<T> {

    private T parse(String json) {
        if (json == null || json.length() == 0) {
            return null;
        }
        return (T) JSON.parseObject(json, getRawType().getClass());
    }

    private String toJsonString(T obj) {
        return JSON.toJSONString(obj);
    }

    @Override
    public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return parse(rs.getString(columnName));
    }

    @Override
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return parse(rs.getString(columnIndex));
    }

    @Override
    public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return parse(cs.getString(columnIndex));
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int columnIndex, T parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(columnIndex, toJsonString(parameter));
    }
}



