package com.watayouxiang.hilt_demo.hilt_demo;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
@Module
@InstallIn(ActivityComponent.class)
public abstract class TestModule {

    @Binds
    public abstract TestAbs bindTestImpl(TestImpl impl);
}
