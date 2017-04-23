package com.Analyze.utils;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by huozongsheng on 2017/4/21.
 */
public class GetTime {
    public static Timestamp now(){
        Date date = new Date();
        return new Timestamp(date.getTime());
    }
}
