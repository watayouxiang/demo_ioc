package com.watayouxiang.dagger2demo.others;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.watayouxiang.dagger2demo.R;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;

/**
 * 其他用法
 * <p>
 * 1、带参数 module
 * 2、@Named 使用
 * 3、Lazy 和 Provider
 */
public class OthersActivity extends AppCompatActivity {

    @Inject
    HttpClient httpClient;

    // @Named 使用
    @Named("jianshu")
    @Inject
    HttpClient jianshuClient;

    // @Named 使用
    @Named("weibo")
    @Inject
    HttpClient weiboClient;

    // 懒加载（不具备局部单例特点）
    @Inject
    Provider<ImClient> provider;

    // 懒加载（具备局部单例特点）
    @Inject
    Lazy<ImClient> lazy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        DaggerMainComponent.builder()
                .mainModule(new MainModule("https://www.baidu.com"))
                .build()
                .injectOthersActivity(this);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.append("------ 带参数 module ------");
        tv_text.append("\n\n");
        tv_text.append(httpClient.toString());
        tv_text.append("\n\n");
        tv_text.append("------ @Named 使用 ------");
        tv_text.append("\n\n");
        tv_text.append(jianshuClient.toString());
        tv_text.append("\n\n");
        tv_text.append(weiboClient.toString());
        tv_text.append("\n\n");
        tv_text.append("------ 懒加载（不具备局部单例特点）------");
        tv_text.append("\n\n");
        tv_text.append(provider.get().toString());
        tv_text.append("\n\n");
        tv_text.append(provider.get().toString());
        tv_text.append("\n\n");
        tv_text.append("------ 懒加载（具备局部单例特点）------");
        tv_text.append("\n\n");
        tv_text.append(lazy.get().toString());
        tv_text.append("\n\n");
        tv_text.append(lazy.get().toString());


    }
}