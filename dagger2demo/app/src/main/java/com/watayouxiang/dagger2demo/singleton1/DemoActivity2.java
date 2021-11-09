package com.watayouxiang.dagger2demo.singleton1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.watayouxiang.dagger2demo.R;

import javax.inject.Inject;

/**
 * 局部单例（自定义Scope，推荐！）
 */
public class DemoActivity2 extends AppCompatActivity {

    @Inject
    ImClient2 imClient;

    @Inject
    ImClient2 imClient1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);

        DaggerDemoComponent.create().injectActivity(this);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.append(imClient.toString());
        tv_text.append("\n\n");
        tv_text.append(imClient1.toString());

    }
}