package com.watayouxiang.hilt_demo.hilt_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.watayouxiang.hilt_demo.R;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HiltDemoActivity extends AppCompatActivity {

    @Inject
    TestAbs testAbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hilt_demo);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.append(testAbs.method());
        tv_text.append("\n\n");
    }
}