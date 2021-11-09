package com.watayouxiang.dagger2demo.singleton2;

import android.app.Application;

import com.watayouxiang.dagger2demo.singleton1.DaggerDemoComponent;
import com.watayouxiang.dagger2demo.singleton1.DemoComponent;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   : 全局单例
 * </pre>
 */
public class MyApp extends Application {

    private DemoComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerDemoComponent.create();
    }

    public DemoComponent getComponent() {
        return component;
    }
}
