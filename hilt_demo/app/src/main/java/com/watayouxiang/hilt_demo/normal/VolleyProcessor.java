package com.watayouxiang.hilt_demo.normal;

import java.util.Map;

import javax.inject.Inject;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
public class VolleyProcessor implements IHttpProcessor {

    @Inject
    public VolleyProcessor() {
    }

    @Override
    public void post(String url, Map<String, Object> params, ICallback callback) {
        callback.onSuccess("VolleyProcessor 调用成功啦～");
    }
}
