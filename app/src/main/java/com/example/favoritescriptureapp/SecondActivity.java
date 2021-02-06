package com.example.favoritescriptureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static com.example.favoritescriptureapp.MainActivity.BOOK_INPUT;
import static com.example.favoritescriptureapp.MainActivity.CHAPTER_INPUT;
import static com.example.favoritescriptureapp.MainActivity.VERSE_INPUT;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String quotation = intent.getStringExtra(BOOK_INPUT)
                + " "
                + intent.getStringExtra(CHAPTER_INPUT)
                + ":"
                + intent.getStringExtra(VERSE_INPUT);

        Log.i("BYUI", "Reveived intent with " + quotation);

        TextView tv2;
        tv2 = findViewById(R.id.textView2);

        tv2.setText(quotation);
    }
}