package com.watayouxiang.hilt_demo.hilt_singleton1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.watayouxiang.hilt_demo.R;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class NextActivity extends AppCompatActivity {

    @Inject
    DbClient dbClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.append(dbClient.toString());
    }
}