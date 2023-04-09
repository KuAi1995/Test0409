package com.ysn.test0409.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ysn.test0409.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
            Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
            startActivity(intent);
            break;

            default:
                break;
        }
    }

    private void init() {
        Button mButton = findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }
}