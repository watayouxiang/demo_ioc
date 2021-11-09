package com.watayouxiang.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.watayouxiang.dagger2demo.simple.DemoActivity;
import com.watayouxiang.dagger2demo.singleton.Demo1Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void demoClick(View view) {
        startActivity(new Intent(this, DemoActivity.class));
    }

    public void demoClick1(View view) {
        startActivity(new Intent(this, Demo1Activity.class));
    }
}