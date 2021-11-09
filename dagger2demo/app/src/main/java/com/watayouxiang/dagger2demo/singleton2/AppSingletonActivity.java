package com.watayouxiang.dagger2demo.singleton2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.watayouxiang.dagger2demo.R;
import com.watayouxiang.dagger2demo.singleton1.DemoComponent;
import com.watayouxiang.dagger2demo.singleton1.ImClient2;

import javax.inject.Inject;

public class AppSingletonActivity extends AppCompatActivity {

    @Inject
    ImClient2 imClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_singleton);

        MyApp app = (MyApp) getApplication();
        app.getComponent().injectAppSingletonActivity(this);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.setText(imClient.toString());

        findViewById(R.id.btn_nextPage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AppSingletonActivity.this, AppSingletonActivity1.class));
            }
        });

    }
}