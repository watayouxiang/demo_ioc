package com.watayouxiang.hilt_demo.hilt_base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.watayouxiang.hilt_demo.R;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class BaseHiltActivity extends AppCompatActivity {

    @Inject
    HttpClient httpClient;

    @Inject
    HttpClient httpClient1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_hilt);

        TextView tv_text = findViewById(R.id.tv_text);
        tv_text.append(httpClient.toString());
        tv_text.append("\n\n");
        tv_text.append(httpClient1.toString());
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