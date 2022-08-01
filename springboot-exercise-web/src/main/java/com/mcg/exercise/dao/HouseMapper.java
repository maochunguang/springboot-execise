package com.mcg.exercise.dao;

import static com.mcg.exercise.dao.HouseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.mcg.exercise.entity.House;
import com.mcg.exercise.extension.mybatis.JacksonTypeHandler;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface HouseMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    BasicColumn[] selectList = BasicColumn.columnList(id, houseAddress, houseInfo, expressInfo, communityName, streetName, createTime, updateTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<House> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("HouseResult")
    Optional<House> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="HouseResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="house_address", property="houseAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="house_info", property="houseInfo", typeHandler=JacksonTypeHandler.class, jdbcType=JdbcType.VARCHAR),
        @Result(column="express_info", property="expressInfo", typeHandler=JacksonTypeHandler.class, jdbcType=JdbcType.VARCHAR),
        @Result(column="community_name", property="communityName", jdbcType=JdbcType.VARCHAR),
        @Result(column="street_name", property="streetName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<House> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, house, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, house, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default int insert(House record) {
        return MyBatis3Utils.insert(this::insert, record, house, c ->
            c.map(houseAddress).toProperty("houseAddress")
            .map(houseInfo).toProperty("houseInfo")
            .map(expressInfo).toProperty("expressInfo")
            .map(communityName).toProperty("communityName")
            .map(streetName).toProperty("streetName")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default int insertSelective(House record) {
        return MyBatis3Utils.insert(this::insert, record, house, c ->
            c.map(houseAddress).toPropertyWhenPresent("houseAddress", record::getHouseAddress)
            .map(houseInfo).toPropertyWhenPresent("houseInfo", record::getHouseInfo)
            .map(expressInfo).toPropertyWhenPresent("expressInfo", record::getExpressInfo)
            .map(communityName).toPropertyWhenPresent("communityName", record::getCommunityName)
            .map(streetName).toPropertyWhenPresent("streetName", record::getStreetName)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", record::getUpdateTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default Optional<House> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, house, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default List<House> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, house, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default List<House> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, house, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default Optional<House> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, house, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    static UpdateDSL<UpdateModel> updateAllColumns(House record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(houseAddress).equalTo(record::getHouseAddress)
                .set(houseInfo).equalTo(record::getHouseInfo)
                .set(expressInfo).equalTo(record::getExpressInfo)
                .set(communityName).equalTo(record::getCommunityName)
                .set(streetName).equalTo(record::getStreetName)
                .set(createTime).equalTo(record::getCreateTime)
                .set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(House record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(houseAddress).equalToWhenPresent(record::getHouseAddress)
                .set(houseInfo).equalToWhenPresent(record::getHouseInfo)
                .set(expressInfo).equalToWhenPresent(record::getExpressInfo)
                .set(communityName).equalToWhenPresent(record::getCommunityName)
                .set(streetName).equalToWhenPresent(record::getStreetName)
                .set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default int updateByPrimaryKey(House record) {
        return update(c ->
            c.set(houseAddress).equalTo(record::getHouseAddress)
            .set(houseInfo).equalTo(record::getHouseInfo)
            .set(expressInfo).equalTo(record::getExpressInfo)
            .set(communityName).equalTo(record::getCommunityName)
            .set(streetName).equalTo(record::getStreetName)
            .set(createTime).equalTo(record::getCreateTime)
            .set(updateTime).equalTo(record::getUpdateTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: house")
    default int updateByPrimaryKeySelective(House record) {
        return update(c ->
            c.set(houseAddress).equalToWhenPresent(record::getHouseAddress)
            .set(houseInfo).equalToWhenPresent(record::getHouseInfo)
            .set(expressInfo).equalToWhenPresent(record::getExpressInfo)
            .set(communityName).equalToWhenPresent(record::getCommunityName)
            .set(streetName).equalToWhenPresent(record::getStreetName)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .set(updateTime).equalToWhenPresent(record::getUpdateTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}