package com.watayouxiang.dagger2demo.module;

import com.watayouxiang.dagger2demo.object.ImClient;

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
public class ImModule {
    @Provides
    public ImClient provideImClient() {
        return new ImClient();
    }
}
