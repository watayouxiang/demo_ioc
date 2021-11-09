package com.watayouxiang.dagger2demo.subcomponent;

import com.watayouxiang.dagger2demo.dependencies.HttpModule;
import com.watayouxiang.dagger2demo.dependencies.ImModule;
import com.watayouxiang.dagger2demo.dependencies.MainScope;

import dagger.Component;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
@MainScope
@Component(modules = {HttpModule.class, ImModule.class})
public interface MainComponent {
    DbComponent getDbComponent();
}
