package com.watayouxiang.dagger2demo.subcomponent;

import com.watayouxiang.dagger2demo.dependencies.DbModule;
import com.watayouxiang.dagger2demo.dependencies.DbScope;

import dagger.Subcomponent;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
@DbScope
@Subcomponent(modules = {DbModule.class})
public interface DbComponent {
    void injectSubcomponentActivity(SubcomponentActivity activity);
}
