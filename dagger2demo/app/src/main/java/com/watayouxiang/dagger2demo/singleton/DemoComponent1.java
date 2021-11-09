package com.watayouxiang.dagger2demo.singleton;

import javax.inject.Singleton;

import dagger.Component;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/08
 *     desc   :
 * </pre>
 */
@Singleton
@Component(modules = {ImModule1.class})
public interface DemoComponent1 {
    void injectDemoActivity1(DemoActivity1 demoActivity1);
}
