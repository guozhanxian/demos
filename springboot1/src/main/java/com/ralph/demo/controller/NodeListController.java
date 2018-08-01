package com.ralph.demo.controller;

import com.ralph.demo.bean.NodeList;
import com.ralph.demo.service.NodeListService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/nodeList")
public class NodeListController
{
    @Resource
    private NodeListService nodeListService;

    @RequestMapping("/findAll")
    public List<NodeList> findAllNode()
    {
        return nodeListService.findAllNode();
    }

    @RequestMapping("/findSonsById")
    public List<NodeList> findSonsById(Integer id)
    {
        return nodeListService.findSonsById(id);
    }

    @RequestMapping("/updateNodeName")
    public String updateNodeName(int id,String nodeName)
    {
        try{
            nodeListService.modifyNodeName(id,nodeName);
            return "200";
        }catch (Exception e){
            e.printStackTrace();
            return "500";
        }
    }
}
