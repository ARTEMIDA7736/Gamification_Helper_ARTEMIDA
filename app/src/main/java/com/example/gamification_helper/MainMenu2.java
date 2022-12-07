package com.example.gamification_helper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainMenu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_2);

        Button GotoLevels = (Button) findViewById(R.id.GoToLevels);

        View.OnClickListener oclBtnGotoLevels = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu2.this, Level_Menu_2.class);
                startActivity(intent);

            }
        };

        GotoLevels.setOnClickListener(oclBtnGotoLevels);

        Button GoToAchievments = (Button) findViewById(R.id.GoToAchievments);

        View.OnClickListener oclBtnGoToAchievments = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu2.this, Achievments_Activity.class);
                startActivity(intent);

            }
        };
        GoToAchievments.setOnClickListener(oclBtnGoToAchievments);
    }
}
