package com.watayouxiang.dagger2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.watayouxiang.dagger2demo.component.Dagger2Component;
import com.watayouxiang.dagger2demo.object.HttpClient;
import com.watayouxiang.dagger2demo.object.ImClient;

import javax.inject.Inject;

public class Dagger2Activity extends AppCompatActivity {

    @Inject
    HttpClient httpClient;

    @Inject
    ImClient imClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger2);

//        Dagger2Component.create().
    }
}