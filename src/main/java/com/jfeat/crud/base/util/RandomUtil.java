package com.jfeat.crud.base.util;
import java.security.SecureRandom;

public class RandomUtil {

    private final static SecureRandom random = new SecureRandom();
    
    /**
     * 获取随机字符串 (基数字符串为大写字母+小写字母+数字）
     * @param length 生成的随机字符串长度
     * @return 随机字符串
     */
    public static String getRandomStr_Base62(int length){
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        return getRandomStr(length, str);    
    }

    /**
     * 获取随机字符串 (基数字符串为小写字段+数字）
     * @param length 生成的随机字符串长度
     * @return 随机字符串
     */
    public static String getRandomStr_Base36(int length){
        final String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        return getRandomStr(length, base);    
    }

    /**
     * 获取随机字符串 (基字符串为小写字段+娄字）
     * @param length 生成的随机字符串长度
     * @return 随机字符串
     */
    public static String getRandomStr(int length){
        final String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        return getRandomStr(length, base);
    }

    /** 
     * @param length 长度
     * @return 随机字符串
     */
    private static String getRandomStr(int length, String baseString) {
        StringBuilder randomNumber = new StringBuilder();
        for(int i = 0; i < length; ++i) {
            int number = random.nextInt(baseString.length());
            randomNumber.append(baseString.charAt(number));
        }

        return randomNumber.toString();
    }

    /**
     * 获取随机数字字符串
     * @param length
     * @return
     */
    public static String getRandomNum(int length){
        StringBuilder randomNumber = new StringBuilder();
        for (int i = 0; i < length; i++) {
            randomNumber.append(random.nextInt(9));
        }
        return randomNumber.toString();
    }


    /**
     * 获取随机数字字符串
     * @param length
     * @return
     */
    @Deprecated
    public static String getRandomCode(int length) {
        return getRandomNum(length);
    }
}
