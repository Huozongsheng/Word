package com.Analyze.repository;

import com.Analyze.model.分词表Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by huozongsheng on 2017/4/23.
 */
@Repository
public interface 分词表 extends JpaRepository<分词表Entity,String> {
}
