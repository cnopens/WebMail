package com.live.webmail.base;

import java.io.Serializable;

/**
 * @author kevin
 * @version Revision: 1.00 Date: 10-12-21下午2:11
 * @Email liuyuhui007@gmail.com
 * 系统领域对象的基类，实现了Serializable接口
 */
public class DomainObject implements Serializable {
    /**
     * 领域对象的代理主键.
     */
    private long id;

    public DomainObject() {
    }

    public DomainObject(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DomainObject)) return false;

        DomainObject that = (DomainObject) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
