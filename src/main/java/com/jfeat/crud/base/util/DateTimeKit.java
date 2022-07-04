package com.jfeat.crud.base.util;

import java.util.Date;

public class DateTimeKit {

    //    最大显示3天 1小时*24*3
    public static final long MAX_TIME = 3600 * 24 * 3;

    public static String toTimeline(Date time){


        long curTime =System.currentTimeMillis() / (long) 1000 ;

        Long timeStamp = time.getTime()/(long)1000;

        long resultTime = curTime - timeStamp;

        if (resultTime < 60 && resultTime >= 0) {
            return "刚刚";

        } else if (resultTime >= 60 && resultTime < 3600) {

            return resultTime / 60 + "分钟前";

        } else if (resultTime >= 3600 && resultTime < 3600 * 24) {

            return resultTime / 3600 + "小时前";

        } else if (resultTime >= 3600 * 24 && resultTime < MAX_TIME) {
            return resultTime / 3600 / 24 + "天前";
        }

//        } else if (resultTime >= 3600 * 24 * 30 && resultTime < 3600 * 24 * 30 * 12) {
//
//            return resultTime / 3600 / 24 / 30 + "个月前";
//
//        } else if (resultTime >= 3600 * 24 * 30 * 12) {
//
//            return resultTime / 3600 / 24 / 30 / 12 + "年前";
//
//        }
        else {

            return "较早前";

        }
    }
}
