package com.watayouxiang.dagger2demo.subcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.watayouxiang.dagger2demo.R;
import com.watayouxiang.dagger2demo.dependencies.DbClient;
import com.watayouxiang.dagger2demo.dependencies.HttpClient;
import com.watayouxiang.dagger2demo.dependencies.ImClient;

import javax.inject.Inject;

/**
 * 多个 Component 组合依赖（@Subcomponent）
 */
public class SubcomponentActivity extends AppCompatActivity {

    @Inject
    ImClient imClient;

    @Inject
    HttpClient httpClient;

    @Inject
    DbClient dbClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcomponent);

        DaggerMainComponent.create()
                .getDbComponent()
                .injectSubcomponentActivity(this);

        TextView viewById = findViewById(R.id.tv_text);
        viewById.append("多个 Component 组合依赖（@Subcomponent）");
        viewById.append("\n\n");
        viewById.append(imClient.toString());
        viewById.append("\n\n");
        viewById.append(httpClient.toString());
        viewById.append("\n\n");
        viewById.append(dbClient.toString());
    }
}