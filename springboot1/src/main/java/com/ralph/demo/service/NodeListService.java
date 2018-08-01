package com.ralph.demo.service;

import com.ralph.demo.bean.NodeList;

import java.util.List;

public interface NodeListService
{
    List<NodeList> findAllNode();

    List<NodeList> findSonsById(Integer id);

    void modifyNodeName(int id,String name);
}
