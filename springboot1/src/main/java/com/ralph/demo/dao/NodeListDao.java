package com.ralph.demo.dao;

import com.ralph.demo.bean.NodeList;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface NodeListDao
{
    @Select("select * from nl")
    @ResultMap("com.ralph.demo.dao.NodeListDao.nodeListMap")
    List<NodeList> findAll();

    @Select("select * from nl where pid=#{id}")
    @ResultMap("com.ralph.demo.dao.NodeListDao.nodeListMap")
    List<NodeList> findChildNodeById(int id);

    @Update("update nl set nodecontent=#{name} where id=#{id}")
    void updateNodeName(@Param("id") int id,@Param("name") String name);

    @Select("select * from nl where pid is null")
    @ResultMap("com.ralph.demo.dao.NodeListDao.nodeListMap")
    List<NodeList> findRoot();

}
