package com.watayouxiang.dagger2demo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.watayouxiang.dagger2demo.component.DaggerMainComponent;
import com.watayouxiang.dagger2demo.module.HttpModule;
import com.watayouxiang.dagger2demo.module.ImModule;
import com.watayouxiang.dagger2demo.object.HttpClient;
import com.watayouxiang.dagger2demo.object.ImClient;

import javax.inject.Inject;

public class MainActivity2 extends AppCompatActivity {
    @Inject
    HttpClient httpClient;

    @Inject
    ImClient imClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        DaggerMainComponent.builder()
                .httpModule(new HttpModule())
                .imModule(new ImModule())
                .build()
                .injectMainActivity2(this);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.setText(httpClient.toString());
    }
}