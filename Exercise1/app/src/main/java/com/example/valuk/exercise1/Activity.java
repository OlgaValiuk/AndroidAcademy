package com.example.valuk.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        Intent intent = getIntent();
        String text = intent.getStringExtra("text");

        TextView textView = findViewById(R.id.textView);
        textView.setText(text);
    }
}
