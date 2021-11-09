package com.watayouxiang.dagger2demo.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.watayouxiang.dagger2demo.R;

import javax.inject.Inject;

/**
 * 局部单例（该单例只能在注入类中局部有效）
 */
public class DemoActivity1 extends AppCompatActivity {

    @Inject
    ImClient1 imClient;

    @Inject
    ImClient1 imClient2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);

        DaggerDemoComponent1.create().injectDemoActivity1(this);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.append(imClient.toString());
        tv_text.append("\n\n");
        tv_text.append(imClient2.toString());

    }
}