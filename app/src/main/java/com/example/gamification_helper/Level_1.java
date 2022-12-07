package com.example.gamification_helper;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Level_1 extends AppCompatActivity {
    private String selectedTopic = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_1);

        final String getSelectedTopic = getIntent().getStringExtra("selectedTopic");

        final LinearLayout answer_1 = findViewById(R.id.Answer_level_1_1);
        final LinearLayout answer_2 = findViewById(R.id.Answer_level_1_2);
        final LinearLayout answer_3 = findViewById(R.id.Answer_level_1_3);


        answer_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "answer_1";
                answer_1.setBackgroundResource(R.drawable.round_back_white_stroke10);

                answer_2.setBackgroundResource(R.drawable.round_back_red);
                answer_3.setBackgroundResource(R.drawable.round_back_red);

            }
        });

        answer_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "answer_2";
                answer_2.setBackgroundResource(R.drawable.round_back_white_stroke10);

                answer_1.setBackgroundResource(R.drawable.round_back_red);
                answer_3.setBackgroundResource(R.drawable.round_back_red);

            }
        });

        answer_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopic = "answer_3";
                answer_3.setBackgroundResource(R.drawable.round_back_white_stroke10);

                answer_1.setBackgroundResource(R.drawable.round_back_red);
                answer_2.setBackgroundResource(R.drawable.round_back_red);

            }
        });


    }
}
