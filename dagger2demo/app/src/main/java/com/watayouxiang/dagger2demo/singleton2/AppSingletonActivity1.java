package com.watayouxiang.dagger2demo.singleton2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.watayouxiang.dagger2demo.R;
import com.watayouxiang.dagger2demo.singleton1.ImClient2;

import javax.inject.Inject;

public class AppSingletonActivity1 extends AppCompatActivity {

    @Inject
    ImClient2 imClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_singleton1);

        MyApp app = (MyApp) getApplication();
        app.getComponent().injectAppSingletonActivity1(this);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.setText(imClient.toString());
    }
}