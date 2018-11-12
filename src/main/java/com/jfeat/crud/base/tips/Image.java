package com.jfeat.crud.base.tips;

/**
 * 接收前端上传图片
 * @author jackyhuang
 * @date 2018/8/22
 */
public class Image {
    private String url;

    public Image() {

    }

    public Image(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Image{" +
                "url='" + url + '\'' +
                '}';
    }
}
