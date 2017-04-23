package com.Analyze.model;

import javax.persistence.*;

/**
 * Created by huozongsheng on 2017/4/23.
 */
@Entity
@Table(name = "分词表", schema = "创新设计", catalog = "")
public class 分词表Entity {
    private String 分词号;
    private String 分词;
    private String 词性;

    @Id
    @Column(name = "分词号", nullable = false, length = 20)
    public String get分词号() {
        return 分词号;
    }

    public void set分词号(String 分词号) {
        this.分词号 = 分词号;
    }

    @Basic
    @Column(name = "分词", nullable = false, length = 10)
    public String get分词() {
        return 分词;
    }

    public void set分词(String 分词) {
        this.分词 = 分词;
    }

    @Basic
    @Column(name = "词性", nullable = false, length = 10)
    public String get词性() {
        return 词性;
    }

    public void set词性(String 词性) {
        this.词性 = 词性;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        分词表Entity 分词表Entity = (分词表Entity) o;

        if (分词号 != null ? !分词号.equals(分词表Entity.分词号) : 分词表Entity.分词号 != null) return false;
        if (分词 != null ? !分词.equals(分词表Entity.分词) : 分词表Entity.分词 != null) return false;
        if (词性 != null ? !词性.equals(分词表Entity.词性) : 分词表Entity.词性 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 分词号 != null ? 分词号.hashCode() : 0;
        result = 31 * result + (分词 != null ? 分词.hashCode() : 0);
        result = 31 * result + (词性 != null ? 词性.hashCode() : 0);
        return result;
    }
}
