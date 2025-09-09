package com.jfeat.crud.base.util;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Util {

    /**
     * 生成输入字符串的MD5哈希值。
     *
     * @param input 要哈希的字符串。
     * @return 输入字符串的MD5哈希值。
     */
    public static String md5(String input) {
        try {
            // 创建MD5的实例
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 为输入字符串生成哈希字节数组
            byte[] messageDigest = md.digest(input.getBytes());
            // 将哈希字节数组转换为十六进制字符串表示
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02x", b));
            }
            // 返回MD5哈希的十六进制表示
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            // 如果MD5算法不可用，则抛出运行时异常
            throw new RuntimeException(e);
        }
    }

    /**
     * 用于生成用户密码, + 盐值
     * @param credentials
     * @param saltSource
     * @return
     */
    public static String md5(String credentials, String saltSource) {
        Md5Hash salt = new Md5Hash(saltSource);
        return (new SimpleHash("MD5", credentials, salt, 1024)).toString();
    }

    public static String encrypt(String source) {
        return encodeMd5(source.getBytes());
    }

    private static String encodeMd5(byte[] source) {
        try {
            return encodeHex(MessageDigest.getInstance("MD5").digest(source));
        } catch (NoSuchAlgorithmException var2) {
            throw new IllegalStateException(var2.getMessage(), var2);
        }
    }

    private static String encodeHex(byte[] bytes) {
        StringBuffer buffer = new StringBuffer(bytes.length * 2);

        for(int i = 0; i < bytes.length; ++i) {
            if ((bytes[i] & 255) < 16) {
                buffer.append("0");
            }

            buffer.append(Long.toString((long)(bytes[i] & 255), 16));
        }

        return buffer.toString();
    }
}
