package com.watayouxiang.dagger2demo.others;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.watayouxiang.dagger2demo.R;

import javax.inject.Inject;

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


    }
}