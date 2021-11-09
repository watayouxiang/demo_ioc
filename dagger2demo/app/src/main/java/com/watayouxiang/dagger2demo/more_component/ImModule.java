package com.watayouxiang.dagger2demo.more_component;

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
public class ImModule {
    @MainScope
    @Provides
    public ImClient provideImClient(){
        return new ImClient();
    }
}
