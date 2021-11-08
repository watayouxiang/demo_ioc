package com.watayouxiang.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.watayouxiang.dagger2demo.component.DaggerMainComponent;
import com.watayouxiang.dagger2demo.object.HttpClient;
import com.watayouxiang.dagger2demo.object.ImClient;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    HttpClient httpClient;

    @Inject
    ImClient imClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.create().injectMainActivity(this);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.setText(httpClient.toString());
        tv_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }
}