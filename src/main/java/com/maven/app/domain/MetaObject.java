package com.maven.app.domain;

import java.util.Date;


/**
 * 抽象的MetaObject
 * 
 * @author FYL
 */
public class MetaObject {

    protected String id;

    protected Date createDate;

    protected Date updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getEntityView() {
        return null;
    }
}
