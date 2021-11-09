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
@Component(modules = {Im1Module.class})
public interface Demo1Component {
    void injectDemo1Activity(Demo1Activity demo1Activity);
}
