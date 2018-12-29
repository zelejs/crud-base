package com.jfeat.crud.base.request;

/**
 * Created by vincenthuang on 2018/12/29.
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
