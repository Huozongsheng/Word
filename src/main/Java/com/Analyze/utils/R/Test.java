package com.Analyze.utils.R;

import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;
import org.rosuda.REngine.REXPMismatchException;;import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws REXPMismatchException {
        // TODO Auto-generated method stub
        RConnection connection=null;
        System.out.println("平均值");
        try {
            //创建对象
            connection = new RConnection();
            String vetor="c(1,2,3,4)";
            connection.eval("meanVal<-mean("+vetor+")");

            //System.out.println("the mean of given vector is="+mean);
            double mean=connection.eval("meanVal").asDouble();
            System.out.println("the mean of given vector is="+mean);
            //connection.eval(arg0)

        } catch (RserveException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("执行脚本");
//        try {
//            connection.eval("source('~/Downloads/dataset_617613-1/ntusd/读入文件.R')");//此处路径也可以这样写D:\\\\myAdd.R
//            String[] t = connection.eval("comments").asStrings();
//            Arrays.stream(t).forEach(e-> System.out.println(e));
//        } catch (RserveException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        connection.close();
    }
}
