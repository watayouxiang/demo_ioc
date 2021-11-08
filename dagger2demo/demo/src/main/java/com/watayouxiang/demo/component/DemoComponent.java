package com.watayouxiang.demo.component;


import com.watayouxiang.demo.DemoActivity;
import com.watayouxiang.demo.module.HttpModule;
import com.watayouxiang.demo.module.ImModule;

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
