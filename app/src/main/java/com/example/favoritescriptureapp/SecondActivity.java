package com.example.favoritescriptureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //TextView tv2, tv3, tv4;
    //String book1;
    //int ch, v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tv2, tv3, tv4;
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);

        String message = getIntent().getStringExtra(MainActivity.BOOK_INPUT);
        String message2 = getIntent().getStringExtra(MainActivity.CHAPTER_INPUT);
        String message3 = getIntent().getStringExtra(MainActivity.VERSE_INPUT);

        tv2.setText(message);
        tv3.setText(message2);
        tv4.setText(message3);
    }
}