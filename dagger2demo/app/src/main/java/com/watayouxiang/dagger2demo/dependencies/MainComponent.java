package com.watayouxiang.dagger2demo.dependencies;

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
@Component(modules = {ImModule.class, HttpModule.class}, dependencies = {DbComponent.class})
public interface MainComponent {
    void injectMoreComponentActivity(MoreComponentActivity activity);
}
