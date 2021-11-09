package com.watayouxiang.hilt_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
}