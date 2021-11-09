package com.watayouxiang.dagger2demo.singleton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.watayouxiang.dagger2demo.R;

import javax.inject.Inject;

public class Demo1Activity extends AppCompatActivity {

    @Inject
    Im1Client imClient;

    @Inject
    Im1Client imClient2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);

//        DaggerDemo1Component.create().injectDemo1Activity(this);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.append(imClient.toString());
        tv_text.append("\n\n");
        tv_text.append(imClient2.toString());

    }
}