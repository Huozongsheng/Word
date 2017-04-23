package com.Analyze.controller;

import com.Analyze.model.分词表Entity;
import com.Analyze.repository.分词表;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by huozongsheng on 2017/4/23.
 */
@Controller
public class MainController {
    @Autowired
    分词表 test;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        分词表Entity tst;
        System.out.println("测试");
        tst = test.findOne("123");
        System.out.println(tst.get分词()+tst.get分词号()+tst.get词性());
        return "index";
    }
}

