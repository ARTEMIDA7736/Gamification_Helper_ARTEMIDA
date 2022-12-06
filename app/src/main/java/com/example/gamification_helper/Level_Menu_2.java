package com.example.gamification_helper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class Level_Menu_2 extends AppCompatActivity
{

    private String selectedTopic = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_menu_2);


        final LinearLayout level_1 = findViewById(R.id.level_1);
        final LinearLayout level_2 = findViewById(R.id.level_2);
        final LinearLayout level_3 = findViewById(R.id.level_3);
        final LinearLayout level_4 = findViewById(R.id.level_4);
        final LinearLayout level_5 = findViewById(R.id.level_5);
        final LinearLayout level_6 = findViewById(R.id.level_6);
        final LinearLayout level_7 = findViewById(R.id.level_7);
        final LinearLayout level_8 = findViewById(R.id.level_8);

        final MaterialButton startLevelBtn = findViewById(R.id.GoToCurrentLevel);

        level_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "level_1";
                level_1.setBackgroundResource(R.drawable.round_back_white_stroke10);

                level_2.setBackgroundResource(R.drawable.round_back_red);
                level_3.setBackgroundResource(R.drawable.round_back_red);
                level_4.setBackgroundResource(R.drawable.round_back_red);
                level_5.setBackgroundResource(R.drawable.round_back_red);
                level_6.setBackgroundResource(R.drawable.round_back_red);
                level_7.setBackgroundResource(R.drawable.round_back_red);
                level_8.setBackgroundResource(R.drawable.round_back_red);
            }
        });

        level_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "level_2";
                level_2.setBackgroundResource(R.drawable.round_back_white_stroke10);

                level_1.setBackgroundResource(R.drawable.round_back_red);
                level_3.setBackgroundResource(R.drawable.round_back_red);
                level_4.setBackgroundResource(R.drawable.round_back_red);
                level_5.setBackgroundResource(R.drawable.round_back_red);
                level_6.setBackgroundResource(R.drawable.round_back_red);
                level_7.setBackgroundResource(R.drawable.round_back_red);
                level_8.setBackgroundResource(R.drawable.round_back_red);

            }
        });

        level_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "level_3";
                level_3.setBackgroundResource(R.drawable.round_back_white_stroke10);

                level_1.setBackgroundResource(R.drawable.round_back_red);
                level_2.setBackgroundResource(R.drawable.round_back_red);
                level_4.setBackgroundResource(R.drawable.round_back_red);
                level_5.setBackgroundResource(R.drawable.round_back_red);
                level_6.setBackgroundResource(R.drawable.round_back_red);
                level_7.setBackgroundResource(R.drawable.round_back_red);
                level_8.setBackgroundResource(R.drawable.round_back_red);

            }
        });

        level_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "level_4";
                level_4.setBackgroundResource(R.drawable.round_back_white_stroke10);

                level_1.setBackgroundResource(R.drawable.round_back_red);
                level_2.setBackgroundResource(R.drawable.round_back_red);
                level_3.setBackgroundResource(R.drawable.round_back_red);
                level_5.setBackgroundResource(R.drawable.round_back_red);
                level_6.setBackgroundResource(R.drawable.round_back_red);
                level_7.setBackgroundResource(R.drawable.round_back_red);
                level_8.setBackgroundResource(R.drawable.round_back_red);

            }
        });

        level_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "level_5";
                level_5.setBackgroundResource(R.drawable.round_back_white_stroke10);

                level_1.setBackgroundResource(R.drawable.round_back_red);
                level_2.setBackgroundResource(R.drawable.round_back_red);
                level_3.setBackgroundResource(R.drawable.round_back_red);
                level_4.setBackgroundResource(R.drawable.round_back_red);
                level_6.setBackgroundResource(R.drawable.round_back_red);
                level_7.setBackgroundResource(R.drawable.round_back_red);
                level_8.setBackgroundResource(R.drawable.round_back_red);

            }
        });

        level_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "level_6";
                level_6.setBackgroundResource(R.drawable.round_back_white_stroke10);

                level_1.setBackgroundResource(R.drawable.round_back_red);
                level_2.setBackgroundResource(R.drawable.round_back_red);
                level_3.setBackgroundResource(R.drawable.round_back_red);
                level_4.setBackgroundResource(R.drawable.round_back_red);
                level_5.setBackgroundResource(R.drawable.round_back_red);
                level_7.setBackgroundResource(R.drawable.round_back_red);
                level_8.setBackgroundResource(R.drawable.round_back_red);

            }
        });

        level_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "level_7";
                level_7.setBackgroundResource(R.drawable.round_back_white_stroke10);

                level_1.setBackgroundResource(R.drawable.round_back_red);
                level_2.setBackgroundResource(R.drawable.round_back_red);
                level_3.setBackgroundResource(R.drawable.round_back_red);
                level_4.setBackgroundResource(R.drawable.round_back_red);
                level_5.setBackgroundResource(R.drawable.round_back_red);
                level_6.setBackgroundResource(R.drawable.round_back_red);
                level_8.setBackgroundResource(R.drawable.round_back_red);

            }
        });

        level_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopic = "level_8";
                level_8.setBackgroundResource(R.drawable.round_back_white_stroke10);

                level_1.setBackgroundResource(R.drawable.round_back_red);
                level_2.setBackgroundResource(R.drawable.round_back_red);
                level_3.setBackgroundResource(R.drawable.round_back_red);
                level_4.setBackgroundResource(R.drawable.round_back_red);
                level_5.setBackgroundResource(R.drawable.round_back_red);
                level_6.setBackgroundResource(R.drawable.round_back_red);
                level_7.setBackgroundResource(R.drawable.round_back_red);

            }
        });

        startLevelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedTopic.isEmpty()) {
                    Toast.makeText(Level_Menu_2.this, "Выберите уровень!", Toast.LENGTH_SHORT).show();
                } else {
                    if (selectedTopic.equals("level_1")){
                        startActivity(new Intent(Level_Menu_2.this, Activity_level_1.class));
                    }
                    if (selectedTopic.equals("level_2")){
                        startActivity(new Intent(Level_Menu_2.this, Activity_level_2.class));
                    }
                    if (selectedTopic.equals("level_3")){
                        startActivity(new Intent(Level_Menu_2.this, Activity_level_3.class));
                    }
                    if (selectedTopic.equals("level_4")){
                        startActivity(new Intent(Level_Menu_2.this, Activity_level_4.class));
                    }
                    if (selectedTopic.equals("level_5")){
                        startActivity(new Intent(Level_Menu_2.this, Activity_level_5.class));
                    }
                    if (selectedTopic.equals("level_6")){
                        startActivity(new Intent(Level_Menu_2.this, Activity_level_6.class));
                    }
                    if (selectedTopic.equals("level_7")){
                        startActivity(new Intent(Level_Menu_2.this, Activity_level_7.class));
                    }
                    if (selectedTopic.equals("level_8")){
                        startActivity(new Intent(Level_Menu_2.this, Activity_level_8.class));
                    }
                }
            }
        });

    }
}