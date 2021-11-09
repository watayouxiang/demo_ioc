package com.watayouxiang.hilt_demo.hilt_singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
@InstallIn(ActivityComponent.class)
@Module
public class ImModule {

    @ActivityScoped
    @Provides
    public ImClient getImClient() {
        return new ImClient();
    }
}
