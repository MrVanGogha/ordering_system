package com.xmu.entity;

import java.util.Date;

/**
 * @Description: 包厢实体
 * @Date: Create in 23:34 2022/3/27
 */
public class Box {
    /**
     * 主键Id
     */
    private Integer id;

    /**
     * 包厢号
     */
    private String boxCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 包厢描述
     */
    private String desc;

    /**
     * 包厢状态 0表示未被预约 1表示已被预约
     */
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoxCode() {
        return boxCode;
    }

    public void setBoxCode(String boxCode) {
        this.boxCode = boxCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Box(Integer id, String boxCode, Date createTime, String desc) {
        this.id = id;
        this.boxCode = boxCode;
        this.createTime = createTime;
        this.desc = desc;
    }

    public Box() {
    }
}
