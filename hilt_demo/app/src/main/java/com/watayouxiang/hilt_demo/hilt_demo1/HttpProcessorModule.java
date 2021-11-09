package com.watayouxiang.hilt_demo.hilt_demo1;

import com.watayouxiang.hilt_demo.normal.IHttpProcessor;
import com.watayouxiang.hilt_demo.normal.OkHttpProcessor;
import com.watayouxiang.hilt_demo.normal.VolleyProcessor;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
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
@Module
@InstallIn(ApplicationComponent.class)
public abstract class HttpProcessorModule {

    @Binds
    @Singleton
    @BindOkHttp
    public abstract IHttpProcessor bindOkHttp(OkHttpProcessor processor);

    @Binds
    @Singleton
    @BindVolley
    public abstract IHttpProcessor bindVolley(VolleyProcessor processor);
}
