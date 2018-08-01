package com.ralph.demo.service;

import com.ralph.demo.bean.NodeList;
import com.ralph.demo.dao.NodeListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("nodeListService")
public class NodeListServiceImpl implements NodeListService
{
    @Resource
    private NodeListDao nodeListDao;

    @Override
    public List<NodeList> findAllNode()
    {
        return nodeListDao.findAll();
    }

    @Override
    public List<NodeList> findSonsById(Integer id)
    {
        if(id == null || id<=0)
        {
            return nodeListDao.findRoot();
        }else{
            return nodeListDao.findChildNodeById(id);
        }
    }

    @Override
    public void modifyNodeName(int id, String name)
    {
        nodeListDao.updateNodeName(id,name);
    }
}
