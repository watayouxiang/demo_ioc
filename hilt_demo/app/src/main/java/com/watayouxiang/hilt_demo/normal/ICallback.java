package com.watayouxiang.hilt_demo.normal;

/**
 * <pre>
 *     author : TaoWang
 *     e-mail : watayouxiang@qq.com
 *     time   : 2021/11/09
 *     desc   :
 * </pre>
 */
public interface ICallback {
    void onSuccess(String result);
    void onFailure(String e);
}
