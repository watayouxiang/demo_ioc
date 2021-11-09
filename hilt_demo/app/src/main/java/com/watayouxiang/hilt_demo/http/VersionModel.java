package com.watayouxiang.hilt_demo.http;

import androidx.annotation.NonNull;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
public class VersionModel {
    public boolean ok;
    public Data data;

    public static class Data {
        public int updateflag;
        public String version;
        public String url;

        @NonNull
        @Override
        public String toString() {
            return "Data{" +
                    "updateflag=" + updateflag +
                    ", version='" + version + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

    @NonNull
    @Override
    public String toString() {
        return "VersionModel{" +
                "ok=" + ok +
                ", data=" + data +
                '}';
    }
}
