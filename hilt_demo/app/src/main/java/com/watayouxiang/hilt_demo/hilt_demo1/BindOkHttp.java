package com.watayouxiang.hilt_demo.hilt_demo1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface BindOkHttp {
}
