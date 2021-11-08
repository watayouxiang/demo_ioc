package com.watayouxiang.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.watayouxiang.demo.annotation.InjectLayout;
import com.watayouxiang.demo.annotation.InjectManager;
import com.watayouxiang.demo.annotation.InjectView;
import com.watayouxiang.demo.annotation.OnClick;
import com.watayouxiang.demo.annotation.OnLongClick;

@InjectLayout(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @InjectView(R.id.text)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InjectManager.inject(this);
        textView.setText("测试文字");
    }

    @OnClick({R.id.btn, R.id.text})
    public void testClick(View view) {
        Toast.makeText(this, "单击", Toast.LENGTH_SHORT).show();
    }

    @OnLongClick({R.id.btn, R.id.text})
    public boolean testLongClick(View v) {
        Toast.makeText(this, "长按", Toast.LENGTH_SHORT).show();
        return true;
    }
}