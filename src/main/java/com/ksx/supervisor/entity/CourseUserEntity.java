package com.ksx.supervisor.entity;

import com.ksx.base.entity.BaseEntity;

public class CourseUserEntity extends BaseEntity{
    private Integer id;

    private Integer uid;

    private Integer cid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}