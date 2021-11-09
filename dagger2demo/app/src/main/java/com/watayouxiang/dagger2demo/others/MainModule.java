package com.watayouxiang.dagger2demo.others;

import javax.inject.Named;

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
    private final String baseUrl;// 带参数 module

    public MainModule(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Provides
    public ImClient provideImClient() {
        return new ImClient();
    }

    @Provides
    public HttpClient provideHttpClient() {
        return new HttpClient(baseUrl);
    }

    @Named("jianshu")// @Named 使用
    @Provides
    public HttpClient provideJianshuClient() {
        return new HttpClient("https://www.jianshu.com");
    }

    @Named("weibo")// @Named 使用
    @Provides
    public HttpClient provideWeiboClient() {
        return new HttpClient("https://www.weibo.com");
    }
}
