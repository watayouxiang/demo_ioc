package com.watayouxiang.dagger2demo.others;

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
@Component(modules = {MainModule.class})
public interface MainComponent {
    void injectOthersActivity(OthersActivity activity);
}
