package com.Analyze.utils.R;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

import java.util.Arrays;

/**
 * Created by huozongsheng on 2017/5/4.
 * 分词
 */
public class Segment {
    private String path = "/Users/huozongsheng/IdeaProjects/Analyze_cloud/src/main/webapp/Comments/";
    private String filename;

    public Segment(String filename) {
        this.path = path + filename;
        this.filename = filename;
    }
    public void setPath(String path){
        this.path = path;
    }
    /**
     * 分词.R为R脚本
     * 需要修改分词程序需在脚本中修改
     */
    public String excute() throws REXPMismatchException, RserveException {
        //此处用来分词
        String segFile = null;
        String workspace = "/Users/huozongsheng/Downloads/dataset_617613-1/ntusd/";

        RConnection connection = new RConnection();
        try {
            System.out.println(path);
            connection.eval("library(jiebaR)\n" +
                    "library(sqldf)\n" +
                    "library(wordcloud2)\n" +
                    "library(arules)\n" +
                    "library(dplyr)");
            connection.eval("setwd(\""+workspace+"\")");
//            connection.eval("comments<-readLines(\"" + path + "\")");
            connection.eval("negative = read.table(\"n.txt\")\n" +
                    "positive = read.table(\"p.txt\")");
            connection.eval("mixseg = worker(bylines=T)");
            connection.eval("path = segment(\""+path+"\",mixseg)");
            segFile = connection.eval("path").asString();
            System.out.println(segFile);
        } catch (RserveException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        connection.close();
        return segFile;
    }

    public static void main(String[] args) throws REXPMismatchException, RserveException {
        Segment segment = new Segment("all.txt");
        segment.excute();
    }
}
