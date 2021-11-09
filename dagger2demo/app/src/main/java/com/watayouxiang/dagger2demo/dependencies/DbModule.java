package com.watayouxiang.dagger2demo.dependencies;

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
public class DbModule {
    @Provides
    @DbScope
    public DbClient provideDbClient(){
        return new DbClient();
    }
}
