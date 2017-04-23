package com.Analyze.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by huozongsheng on 2017/4/23.
 */
@Entity
@Table(name = "评论源", schema = "创新设计", catalog = "")
public class 评论源Entity {
    private String 评论编号;
    private String 评论;
    private Date 插入时间;

    @Id
    @Column(name = "评论编号", nullable = false, length = 20)
    public String get评论编号() {
        return 评论编号;
    }

    public void set评论编号(String 评论编号) {
        this.评论编号 = 评论编号;
    }

    @Basic
    @Column(name = "评论", nullable = false, length = 200)
    public String get评论() {
        return 评论;
    }

    public void set评论(String 评论) {
        this.评论 = 评论;
    }

    @Basic
    @Column(name = "插入时间", nullable = false)
    public Date get插入时间() {
        return 插入时间;
    }

    public void set插入时间(Date 插入时间) {
        this.插入时间 = 插入时间;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        评论源Entity 评论源Entity = (评论源Entity) o;

        if (评论编号 != null ? !评论编号.equals(评论源Entity.评论编号) : 评论源Entity.评论编号 != null) return false;
        if (评论 != null ? !评论.equals(评论源Entity.评论) : 评论源Entity.评论 != null) return false;
        if (插入时间 != null ? !插入时间.equals(评论源Entity.插入时间) : 评论源Entity.插入时间 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 评论编号 != null ? 评论编号.hashCode() : 0;
        result = 31 * result + (评论 != null ? 评论.hashCode() : 0);
        result = 31 * result + (插入时间 != null ? 插入时间.hashCode() : 0);
        return result;
    }
}
