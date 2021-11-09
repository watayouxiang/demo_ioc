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
@Singleton
@Module
public class Im1Module {
    @Singleton
    @Provides
    public Im1Client provideImClient() {
        return new Im1Client();
    }
}
