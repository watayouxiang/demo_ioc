package com.watayouxiang.hilt_demo.normal;

import java.util.Map;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
public class HttpHelper implements IHttpProcessor {
    private static IHttpProcessor mProcessor = null;

    public static void init(IHttpProcessor processor) {
        mProcessor = processor;
    }

    @Override
    public void post(String url, Map<String, Object> params, ICallback callback) {
        mProcessor.post(url, params, callback);
    }

    // ====================================================================================
    // singleton
    // ====================================================================================

    private static HttpHelper instance;

    public static HttpHelper obtain() {
        synchronized (HttpHelper.class) {
            if (instance == null) {
                instance = new HttpHelper();
            }
        }
        return instance;
    }

    private HttpHelper() {
    }
}
