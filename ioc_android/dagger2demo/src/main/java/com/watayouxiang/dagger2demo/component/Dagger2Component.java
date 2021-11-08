package com.watayouxiang.dagger2demo.component;

import com.watayouxiang.dagger2demo.Dagger2Activity;
import com.watayouxiang.dagger2demo.object.HttpClient;
import com.watayouxiang.dagger2demo.object.ImClient;

import dagger.Component;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/08
 *     desc   :
 * </pre>
 */
@Component(modules = {HttpClient.class, ImClient.class})
public interface Dagger2Component {
    void injectDagger2Activity(Dagger2Activity dagger2Activity);
}
