package com.watayouxiang.demo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.watayouxiang.demo.component.DaggerDemoComponent;
import com.watayouxiang.demo.module.HttpModule;
import com.watayouxiang.demo.module.ImModule;
import com.watayouxiang.demo.object.HttpClient;

import javax.inject.Inject;

/**
 * dagger2 的基本使用
 */
public class DemoActivity extends AppCompatActivity {

    @Inject
    HttpClient httpClient;

    @Inject
    HttpClient httpClient2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        // 注解第一种方式
        DaggerDemoComponent.create().injectDemoActivity(this);

        // 注解第二种方式
        if (false) {
            DaggerDemoComponent.builder()
                    .httpModule(new HttpModule())
                    .imModule(new ImModule())
                    .build()
                    .injectDemoActivity(this);
        }

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.setText(httpClient.toString());
        tv_text.append("\n\n");
        tv_text.append(httpClient2.toString());
    }
}