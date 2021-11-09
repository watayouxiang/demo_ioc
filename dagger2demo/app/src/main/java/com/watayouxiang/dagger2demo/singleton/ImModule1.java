package com.watayouxiang.dagger2demo.singleton;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/08
 *     desc   :
 * </pre>
 */
@Module
public class ImModule1 {
    @Singleton
    @Provides
    public ImClient1 provideImClient1() {
        return new ImClient1();
    }
}
