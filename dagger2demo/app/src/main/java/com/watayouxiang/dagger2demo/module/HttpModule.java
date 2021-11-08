package com.watayouxiang.dagger2demo.module;

import com.watayouxiang.dagger2demo.object.HttpClient;

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
public class HttpModule {
    @Provides
    public HttpClient provideHttpClient(){
        return new HttpClient();
    }
}
