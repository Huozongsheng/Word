package com.Analyze.model;

import javax.persistence.*;

/**
 * Created by huozongsheng on 2017/4/23.
 */
@Entity
@Table(name = "停用词库", schema = "创新设计", catalog = "")
public class 停用词库Entity {
    private String 停用词号;
    private String 停用词;

    @Id
    @Column(name = "停用词号", nullable = false, length = 20)
    public String get停用词号() {
        return 停用词号;
    }

    public void set停用词号(String 停用词号) {
        this.停用词号 = 停用词号;
    }

    @Basic
    @Column(name = "停用词", nullable = false, length = 10)
    public String get停用词() {
        return 停用词;
    }

    public void set停用词(String 停用词) {
        this.停用词 = 停用词;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        停用词库Entity that = (停用词库Entity) o;

        if (停用词号 != null ? !停用词号.equals(that.停用词号) : that.停用词号 != null) return false;
        if (停用词 != null ? !停用词.equals(that.停用词) : that.停用词 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 停用词号 != null ? 停用词号.hashCode() : 0;
        result = 31 * result + (停用词 != null ? 停用词.hashCode() : 0);
        return result;
    }
}
