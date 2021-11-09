package com.watayouxiang.hilt_demo.hilt_demo;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ActivityContext;
import dagger.hilt.android.qualifiers.ApplicationContext;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
public class TestImpl implements TestAbs {
    @Inject
    public TestImpl() {
    }

//    @Inject
//    public TestImpl(@ActivityContext Activity activity) {
//    }

//    @Inject
//    public TestImpl(@ApplicationContext Application application) {
//    }

    @Override
    public String method() {
        return "TestImpl method() is call";
    }
}
