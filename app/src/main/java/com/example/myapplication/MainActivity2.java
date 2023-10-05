package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public TextView textView;
    public TextView displayName;
    String username;
    String name1;
    String name2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        displayName = findViewById(R.id.textView2);
        name1 = getIntent().getStringExtra("firstname");
        name2 = getIntent().getStringExtra("lastname");
        username = name1 + " " + name2;

        displayName.setText(username);
    }
}