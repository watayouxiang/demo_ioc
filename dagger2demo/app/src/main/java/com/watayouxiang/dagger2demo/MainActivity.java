package com.watayouxiang.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.watayouxiang.dagger2demo.dependencies.MoreComponentActivity;
import com.watayouxiang.dagger2demo.simple.DemoActivity;
import com.watayouxiang.dagger2demo.singleton.DemoActivity1;
import com.watayouxiang.dagger2demo.singleton1.DemoActivity2;
import com.watayouxiang.dagger2demo.singleton2.AppSingletonActivity;
import com.watayouxiang.dagger2demo.subcomponent.SubcomponentActivity;

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
        startActivity(new Intent(this, DemoActivity1.class));
    }

    public void demoClick2(View view) {
        startActivity(new Intent(this, DemoActivity2.class));
    }

    public void demoClick3(View view) {
        startActivity(new Intent(this, AppSingletonActivity.class));
    }

    public void demoClick4(View view) {
        startActivity(new Intent(this, MoreComponentActivity.class));
    }

    public void demoClick5(View view) {
        startActivity(new Intent(this, SubcomponentActivity.class));
    }
}