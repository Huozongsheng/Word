package com.Analyze.model;

import javax.persistence.*;

/**
 * Created by huozongsheng on 2017/4/23.
 */
@Entity
@Table(name = "积极词库", schema = "创新设计", catalog = "")
public class 积极词库Entity {
    private String 积极词号;
    private String 积极词;
    private double 权重;

    @Id
    @Column(name = "积极词号", nullable = false, length = 20)
    public String get积极词号() {
        return 积极词号;
    }

    public void set积极词号(String 积极词号) {
        this.积极词号 = 积极词号;
    }

    @Basic
    @Column(name = "积极词", nullable = false, length = 10)
    public String get积极词() {
        return 积极词;
    }

    public void set积极词(String 积极词) {
        this.积极词 = 积极词;
    }

    @Basic
    @Column(name = "权重", nullable = false, precision = 0)
    public double get权重() {
        return 权重;
    }

    public void set权重(double 权重) {
        this.权重 = 权重;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        积极词库Entity that = (积极词库Entity) o;

        if (Double.compare(that.权重, 权重) != 0) return false;
        if (积极词号 != null ? !积极词号.equals(that.积极词号) : that.积极词号 != null) return false;
        if (积极词 != null ? !积极词.equals(that.积极词) : that.积极词 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = 积极词号 != null ? 积极词号.hashCode() : 0;
        result = 31 * result + (积极词 != null ? 积极词.hashCode() : 0);
        temp = Double.doubleToLongBits(权重);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
