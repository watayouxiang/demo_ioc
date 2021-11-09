package com.watayouxiang.hilt_demo;

import android.app.Application;

import com.watayouxiang.hilt_demo.http.HttpHelper;
import com.watayouxiang.hilt_demo.http.OkHttpProcessor;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HttpHelper.init(new OkHttpProcessor());
    }
}
