package com.Analyze.utils;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by huozongsheng on 2017/4/21.
 */
public class GetTime {
    public static java.sql.Date now(){
        Date date = new Date();
        return new java.sql.Date(date.getTime());
    }
    public static void main(String[] args){
        System.out.println(GetTime.now());
    }
}
