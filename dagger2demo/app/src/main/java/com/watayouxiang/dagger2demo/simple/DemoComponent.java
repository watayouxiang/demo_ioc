package com.watayouxiang.dagger2demo.simple;


import dagger.Component;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/08
 *     desc   :
 * </pre>
 */
@Component(modules = {HttpModule.class, ImModule.class})
public interface DemoComponent {
    void injectDemoActivity(DemoActivity demoActivity);
}
