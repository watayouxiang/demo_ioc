package com.watayouxiang.dagger2demo.singleton1;

import com.watayouxiang.dagger2demo.singleton2.AppSingletonActivity;
import com.watayouxiang.dagger2demo.singleton2.AppSingletonActivity1;

import dagger.Component;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
@DemoScope
@Component(modules = {DemoModule.class})
public interface DemoComponent {
    void injectActivity(DemoActivity2 demoActivity2);

    void injectAppSingletonActivity(AppSingletonActivity activity);

    void injectAppSingletonActivity1(AppSingletonActivity1 activity);
}
