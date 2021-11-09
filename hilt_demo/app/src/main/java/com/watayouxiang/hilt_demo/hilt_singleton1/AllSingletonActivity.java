package com.watayouxiang.hilt_demo.hilt_singleton1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.watayouxiang.hilt_demo.R;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AllSingletonActivity extends AppCompatActivity {

    @Inject
    DbClient dbClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_singleton);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.append(dbClient.toString());

        findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AllSingletonActivity.this, NextActivity.class));
            }
        });
    }
}

// Hilt 提供给了如下组件：
// --------------------------------------------------------------------------------------------------------
// Android类									生成的组件							作用域
// --------------------------------------------------------------------------------------------------------
// Application									ApplicationComponent				@Singleton
// ViewModel									ActivityRetainedComponent			@ActivityRetainedScope
// Activity										ActivityComponent					@ActivityScoped
// Fragment										FragmentComponent					@FragmentScoped
// View											ViewComponent						@ViewScoped
// 带有@WithFragmentBindings注释的View			ViewWithFragmentComponent			@ViewScoped
// Service										ServiceComponent					@ServiceScoped
// --------------------------------------------------------------------------------------------------------