package com.rj1814.dao;

import com.rj1814.pojo.entity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface accountDao {
    //查找全部
    @Select("select * from demo")
    List<entity> findAll();
//id查找
    @Select("select * from demo where id=#{id}")
    entity idfindAll(int id);
    //增加
    @Insert("insert into demo values (#{id},#{name})")
    void insert(entity entity);

    @Update("update demo set name=#{name} where id=#{id}")
    void updata(entity entity);

    @Delete("delete from demo where id=#{id}")
    void data(int id);
}
