package com.watayouxiang.dagger2demo.component;

import com.watayouxiang.dagger2demo.MainActivity;
import com.watayouxiang.dagger2demo.MainActivity2;
import com.watayouxiang.dagger2demo.module.HttpModule;
import com.watayouxiang.dagger2demo.module.ImModule;

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
public interface MainComponent {
    void injectMainActivity(MainActivity mainActivity);

    void injectMainActivity2(MainActivity2 mainActivity2);
}
