package com.watayouxiang.hilt_demo.hilt_singleton1;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
@InstallIn(ApplicationComponent.class)
@Module
public class DbModule {

    @Singleton
    @Provides
    public DbClient getDbClient() {
        return new DbClient();
    }
}
