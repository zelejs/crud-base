package com.jfeat.crud.base.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * @description: 文件工具类
 * @project: code-stack-cloud
 * @date: 2024/12/25 10:00
 * @author: hhhhhtao
 */
public class FileUtil {

    /**
     * 将字符串写入到指定文件，创建新的文件
     * @param path 目录路径
     * @param fileName 文件名
     * @param content 文件内容
     * @param isCover 是否覆盖原文件
     * @throws IOException
     */
    public static void writeStringToFile(Path path, String fileName, String content, boolean isCover) throws IOException {
        if (!Files.exists(path)) {
            Files.createDirectories(path);
        }
        Path destinationPath = path.resolve(fileName);
        if (Files.exists(destinationPath)) {
            throw new IOException("File already exists: " + destinationPath);
        }
        if (isCover) {
            Files.write(destinationPath, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } else {
            Files.write(destinationPath, content.getBytes(), StandardOpenOption.CREATE);
        }
    }

    /**
     * 读取文件，path中需要有文件名
     * @param path
     * @return
     * @throws IOException
     */
    public static String readString(Path path) throws IOException {
        if (!Files.exists(path)) {
            throw new IOException("File does not exist: " + path);
        }
        return Files.readString(path);
    }

    /**
     * 写入文件内容，覆盖原有的内容
     * @param path
     * @param content
     * @throws IOException
     */
    public static void writeString(Path path, String content) throws IOException {
        if (!Files.exists(path)) {
            throw new IOException("File does not exist: " + path);
        }
        Files.writeString(path, content);
    }

    /**
     * 文件重命名
     * @param oldFilePath 旧的文件路径
     * @param newFilePath 新的文件路径
     * @throws IOException
     */
    public static void rename(Path oldFilePath, Path newFilePath) throws IOException {
        if (!Files.exists(oldFilePath)) {
            throw new IOException("File does not exist: " + oldFilePath);
        }
        Files.move(oldFilePath, newFilePath);
    }
}
