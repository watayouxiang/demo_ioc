package com.watayouxiang.hilt_demo.http;

import java.util.Map;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
public interface IHttpProcessor {
    void post(String url, Map<String, Object> params, ICallback callback);
}
