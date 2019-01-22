package com.lanny.kotlincardviewdemo.legacy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.lanny.kotlincardviewdemo.R;

public class JavaCardViewActivity extends AppCompatActivity {
    Fragment fragment;
    TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_card_view);

        init();
        fragment = new JavaFragmentCardView();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.activityJavaCard, fragment)
                .commit();

    }

    private void init() {
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
    }
}
