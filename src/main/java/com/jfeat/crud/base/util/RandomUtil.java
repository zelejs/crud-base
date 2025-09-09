package com.jfeat.crud.base.util;
import java.security.SecureRandom;

public class RandomUtil {
    /**
     * 安全随机数生成器
     */
    private final static SecureRandom random = new SecureRandom();

    /**
     * 返回一段指定长度的随机字符串
     *
     * @param length 长度
     * @return 随机字符串
     */
    public static String getRandomStr(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789.";
        StringBuilder randomNumber = new StringBuilder();

        for(int i = 0; i < length; ++i) {
            int number = random.nextInt(base.length());
            randomNumber.append(base.charAt(number));
        }

        return randomNumber.toString();
    }

    /**
     * 获取随机数字符串
     * @param length
     * @return
     */
    public static String getRandomCode(int length) {
        StringBuilder randomNumber = new StringBuilder();
        for (int i = 0; i < length; i++) {
            randomNumber.append(random.nextInt(9));
        }
        return randomNumber.toString();
    }
}
