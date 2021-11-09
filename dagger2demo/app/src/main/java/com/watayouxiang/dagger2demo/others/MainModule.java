package com.watayouxiang.dagger2demo.others;

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
public class MainModule {
    // 带参数module
    private final String baseUrl;

    public MainModule(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @MainScope
    @Provides
    public ImClient provideImClient() {
        return new ImClient();
    }

    @MainScope
    @Provides
    public HttpClient provideHttpClient() {
        return new HttpClient(baseUrl);
    }
}
