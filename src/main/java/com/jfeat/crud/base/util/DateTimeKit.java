package com.jfeat.crud.base.util;

import java.util.Date;

public class DateTimeKit {

    public static String toTimeline(Date time){
        long curTime =System.currentTimeMillis() / (long) 1000 ;

        Long timeStamp = time.getTime()/(long)1000;

        long resultTime = curTime - timeStamp;

        if (resultTime < 60 && resultTime >= 0) {
            return "刚刚";

        } else if (resultTime >= 60 && resultTime <60*2) {

            return "1分钟前";

        } else if (resultTime >= 60*2 && resultTime < 3600 * 2) {

            return "2小时前";

        } else if (resultTime >= 3600 * 2 && resultTime < 3600 * 24 * 3) {

            return "3天前";
        }
        else if (resultTime >= 3600 * 24 * 3 && resultTime < 3600 * 24 * 7) {
            return "7天前";
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
