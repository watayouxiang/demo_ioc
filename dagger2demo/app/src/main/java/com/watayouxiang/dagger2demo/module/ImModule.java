package com.watayouxiang.dagger2demo.module;

import com.watayouxiang.dagger2demo.object.ImClient;

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
//@Singleton
@Module
public class ImModule {
//    @Singleton
    @Provides
    public ImClient provideImClient() {
        return new ImClient();
    }
}
