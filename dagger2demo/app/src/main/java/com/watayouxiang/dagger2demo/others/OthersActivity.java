package com.watayouxiang.dagger2demo.others;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.watayouxiang.dagger2demo.R;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * 其他用法
 * <p>
 * 1、带参数module
 */
public class OthersActivity extends AppCompatActivity {

    @Inject
    ImClient imClient;

    @Inject
    HttpClient httpClient;

    @Named("jianshu")// @Named 使用
    @Inject
    HttpClient jianshuClient;

    @Named("weibo")// @Named 使用
    @Inject
    HttpClient weiboClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        DaggerMainComponent.builder()
                .mainModule(new MainModule("https://www.baidu.com"))
                .build()
                .injectOthersActivity(this);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.append(imClient.toString());
        tv_text.append("\n\n");
        tv_text.append(httpClient.toString());
        tv_text.append("\n\n");
        tv_text.append(jianshuClient.toString());
        tv_text.append("\n\n");
        tv_text.append(weiboClient.toString());
        tv_text.append("\n\n");


    }
}