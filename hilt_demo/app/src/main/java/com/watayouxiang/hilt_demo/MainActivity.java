package com.watayouxiang.hilt_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.watayouxiang.hilt_demo.hilt_base.BaseHiltActivity;
import com.watayouxiang.hilt_demo.hilt_demo.HiltDemoActivity;
import com.watayouxiang.hilt_demo.hilt_singleton.SingletonHiltActivity;
import com.watayouxiang.hilt_demo.hilt_singleton1.AllSingletonActivity;
import com.watayouxiang.hilt_demo.normal.HttpCallback;
import com.watayouxiang.hilt_demo.normal.HttpHelper;
import com.watayouxiang.hilt_demo.normal.VersionModel;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test_postReq(View view) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("p_is_android", "1");
        map.put("version", "2.4.7");
        HttpHelper.obtain().post("https://www.tiocloud.com/mytio/sys/version.tio_x", map, new HttpCallback<VersionModel>() {
            @Override
            public void onSuccess(VersionModel model) {
                Toast.makeText(MainActivity.this, model.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void test_baseHilt(View view) {
        startActivity(new Intent(this, BaseHiltActivity.class));
    }

    public void test_singletonHilt(View view) {
        startActivity(new Intent(this, SingletonHiltActivity.class));
    }

    public void test_singleton_all(View view) {
        startActivity(new Intent(this, AllSingletonActivity.class));
    }

    public void test_hilt_demo(View view) {
        startActivity(new Intent(this, HiltDemoActivity.class));
    }
}