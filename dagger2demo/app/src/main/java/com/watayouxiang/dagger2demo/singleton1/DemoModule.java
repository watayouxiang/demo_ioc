package com.watayouxiang.dagger2demo.singleton1;

import dagger.Module;
import dagger.Provides;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
@Module
public class DemoModule {
    @DemoScope
    @Provides
    public ImClient2 provideImClient2(){
        return new ImClient2();
    }
}
