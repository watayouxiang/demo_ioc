package com.watayouxiang.hilt_demo.hilt_base;

import dagger.Module;
import dagger.Provides;
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
@InstallIn(ActivityComponent.class)
@Module
public class HttpModule {

    @Provides
    public HttpClient getHttpClient() {
        return new HttpClient();
    }
}
