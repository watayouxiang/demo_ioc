package com.watayouxiang.hilt_demo.hilt_demo1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.watayouxiang.hilt_demo.MyApplication;
import com.watayouxiang.hilt_demo.R;
import com.watayouxiang.hilt_demo.normal.HttpCallback;
import com.watayouxiang.hilt_demo.normal.ICallback;
import com.watayouxiang.hilt_demo.normal.IHttpProcessor;
import com.watayouxiang.hilt_demo.normal.VersionModel;

import java.util.HashMap;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HiltDemo1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hilt_demo1);
        TextView tv_text = findViewById(R.id.tv_text);

        MyApplication app = (MyApplication) getApplication();
        IHttpProcessor processor = app.getProcessor();

        HashMap<String, Object> map = new HashMap<>();
        map.put("p_is_android", "1");
        map.put("version", "2.4.7");
        processor.post("https://www.tiocloud.com/mytio/sys/version.tio_x", map, new ICallback() {
            @Override
            public void onSuccess(String result) {
                tv_text.setText(result);
            }

            @Override
            public void onFailure(String e) {
                tv_text.setText(e);
            }
        });
    }
}