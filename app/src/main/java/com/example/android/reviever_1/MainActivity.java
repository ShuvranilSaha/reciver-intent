package com.example.android.reviever_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView intentTextView = findViewById(R.id.intent_text);
        Button button = findViewById(R.id.button);

        Intent intent = getIntent();
        String str = intent.getStringExtra("result");
        intentTextView.setText(str);


        button.setOnClickListener(view -> {
            Intent intent1 = new Intent();
            intent1.putExtra("result", "hello from mars!");
            this.setResult(101, intent1);
            finish();
        });
    }
}