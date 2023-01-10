package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btShowSecond = findViewById(R.id.bt_show_second);
        btShowSecond.setOnClickListener(o->{
          Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });
        Log.d(Log,"onStart");
    }
}