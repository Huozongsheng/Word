package com.Analyze.controller;

import com.Analyze.model.分词表Entity;
import com.Analyze.repository.分词表;
import com.Analyze.utils.FileIO.FileOutPut;
import com.Analyze.utils.FileIO.readTxtFile;
import com.Analyze.utils.R.Segment;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RserveException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

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
        return "index";
    }
    //评论文件上传后台
    /*
    前端数据上传要求
    1、将id设置为"fileid"
    2、连接到"/analyze/upload/"
     */
    @RequestMapping(value = "/analyze/upload", produces = "text/html;charset=utf-8")
    @ResponseBody
    public String uploadFile(@RequestParam("fileid") MultipartFile file) throws IOException, REXPMismatchException, RserveException {
        //获取文件名
        String name = file.getOriginalFilename();
        //将文件存到本地
        FileOutPut outPut = new FileOutPut(file);
        /**
         * 改为自己电脑的路径
         * outPut.setPath("你的路径");
         */
        outPut.excute();
        //调用R进行分词
        Segment segment = new Segment(name);
        /**
         * 改为自己电脑的路径
         * segment.setPath("你的路径");
         */
        segment.excute();
        return "{\"result\":\"success\"}";
    }

    @RequestMapping(value = "/analyze/learnStopWord", method = RequestMethod.GET)
    public String learnStopWord(){

        return "/LearnStopWords";
    }




}

