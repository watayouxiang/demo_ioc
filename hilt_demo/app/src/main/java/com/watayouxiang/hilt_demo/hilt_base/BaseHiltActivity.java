package com.watayouxiang.hilt_demo.hilt_base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.watayouxiang.hilt_demo.R;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class BaseHiltActivity extends AppCompatActivity {

    @Inject
    HttpClient httpClient;

    @Inject
    HttpClient httpClient1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_hilt);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.append(httpClient.toString());
        tv_text.append("\n\n");
        tv_text.append(httpClient1.toString());
    }
}