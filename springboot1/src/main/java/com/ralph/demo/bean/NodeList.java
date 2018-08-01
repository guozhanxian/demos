package com.ralph.demo.bean;

public class NodeList
{
    private Integer id;
    private String nodecontent;
    private Integer pid;
    private int isParent = 1;

    public int getIsParent()
    {
        return isParent;
    }

    public void setIsParent(int isParent)
    {
        this.isParent = isParent;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNodecontent()
    {
        return nodecontent;
    }

    public void setNodecontent(String nodecontent)
    {
        this.nodecontent = nodecontent;
    }

    public Integer getPid()
    {
        return pid;
    }

    public void setPid(Integer pid)
    {
        this.pid = pid;
    }
}
