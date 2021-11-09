package com.watayouxiang.hilt_demo;

import android.app.Application;

import com.watayouxiang.hilt_demo.hilt_demo1.BindOkHttp;
import com.watayouxiang.hilt_demo.hilt_demo1.BindVolley;
import com.watayouxiang.hilt_demo.normal.HttpHelper;
import com.watayouxiang.hilt_demo.normal.IHttpProcessor;
import com.watayouxiang.hilt_demo.normal.OkHttpProcessor;

import javax.inject.Inject;

import dagger.hilt.android.HiltAndroidApp;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
@HiltAndroidApp
public class MyApplication extends Application {

//    @BindOkHttp
    @BindVolley
    @Inject
    IHttpProcessor processor;

    @Override
    public void onCreate() {
        super.onCreate();
        HttpHelper.init(new OkHttpProcessor());
    }

    public IHttpProcessor getProcessor() {
        return processor;
    }
}
