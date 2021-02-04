package com.example.favoritescriptureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String BOOK_INPUT = "Book";
    public static final String CHAPTER_INPUT = "Chapter";
    public static final String VERSE_INPUT = "Verse";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void sendScripture(View view) {
        //bookInput = (EditText) findViewById(R.id.bookInput);
        //chapterInput = (EditText) findViewById(R.id.chapterInput);
        //verseInput = (EditText) findViewById(R.id.verseInput);


        EditText bookInput = (EditText) findViewById(R.id.bookInput);
        EditText chapterInput = (EditText) findViewById(R.id.chapterInput);
        EditText verseInput = (EditText) findViewById(R.id.verseInput);

        Button submitButton;

        submitButton = (Button) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = bookInput.getText().toString();
                String message2 = chapterInput.getText().toString();
                String message3 = verseInput.getText().toString();

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra(BOOK_INPUT, message);
                i.putExtra(CHAPTER_INPUT, message2);
                i.putExtra(VERSE_INPUT, message3);


                startActivity(i);
            }
        });
    }



}