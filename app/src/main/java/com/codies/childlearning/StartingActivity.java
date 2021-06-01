package com.codies.childlearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class StartingActivity extends AppCompatActivity {


    AppCompatImageView englishCV;
    AppCompatImageView urduCV;
    AppCompatImageView numberCV;
    FloatingActionButton floatingActionButton;
    FloatingActionButton floatingActionButton1;
    FloatingActionButton floatingActionButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        englishCV = findViewById(R.id.english);
        urduCV = findViewById(R.id.urdu);
        numberCV = findViewById(R.id.number);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        floatingActionButton1 = findViewById(R.id.floatingActionButton1);
        floatingActionButton2 = findViewById(R.id.floatingActionButton2);

        englishCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartingActivity.this, AlphabetsActivity.class);
                intent.putExtra("check", "isEnglish");
                startActivity(intent);
            }
        });
        urduCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartingActivity.this, AlphabetsActivity.class);
                intent.putExtra("check", "isUrdu");
                startActivity(intent);
            }
        });

        numberCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartingActivity.this, AlphabetsActivity.class);
                intent.putExtra("check", "isNumber");
                startActivity(intent);
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartingActivity.this, Drawingg.class);
                startActivity(intent);
            }
        });
        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartingActivity.this, DrawingUrdu.class);
                startActivity(intent);
            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartingActivity.this, DrawingDigit.class);
                startActivity(intent);
            }
        });



    }
}
