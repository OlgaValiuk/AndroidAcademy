package com.example.valuk.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activityOnClick(View v){
        Intent intent = new Intent(this, Activity.class);
        EditText editText = findViewById(R.id.txtType);
        String text = editText.getText().toString();
        intent.putExtra("text", text);
        startActivity(intent);
    }


}
