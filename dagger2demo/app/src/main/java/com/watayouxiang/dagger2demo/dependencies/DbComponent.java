package com.watayouxiang.dagger2demo.dependencies;

import dagger.Component;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
@DbScope
@Component(modules = {DbModule.class})
public interface DbComponent {
    DbClient provideDbClient();
}
