package com.watayouxiang.hilt_demo.http;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
public abstract class HttpCallback<Result> implements ICallback {
    @Override
    public void onSuccess(String result) {
        // 1.得到泛型Result，具体的class
        Class<?> clz = analysisClassInfo(this);
        // 2.把String转成javaBean
        Gson gson = new Gson();
        Result objResult = gson.fromJson(result, (Type) clz);
        // 3.把javaBean交给用户
        onSuccess(objResult);
    }

    public abstract void onSuccess(Result model);

    // 得到泛型Result，具体的class
    private Class<?> analysisClassInfo(Object obj) {
        Type genType = obj.getClass().getGenericSuperclass();
        Type[] types = ((ParameterizedType) genType).getActualTypeArguments();
        return (Class<?>) types[0];
    }

    @Override
    public void onFailure(String e) {

    }
}
