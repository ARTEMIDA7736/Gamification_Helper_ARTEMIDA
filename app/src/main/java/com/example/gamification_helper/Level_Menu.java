package com.example.gamification_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Level_Menu extends AppCompatActivity {
    private TextView coinViewLevelMenu, levelViewLevelMenu;
    private LinearLayout[] level_list;
    private ImageView avatarImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_menu);

        coinViewLevelMenu = findViewById(R.id.CoinCounterLevelMenu);
        levelViewLevelMenu = findViewById(R.id.LevelCounterLevelMenu);

        avatarImage = findViewById(R.id.avatarView);
        HatMaker.makeHat(levelViewLevelMenu, coinViewLevelMenu, avatarImage);

        final LinearLayout level_1 = findViewById(R.id.level_1),
                level_2 = findViewById(R.id.level_2),
                level_3 = findViewById(R.id.level_3),
                level_4 = findViewById(R.id.level_4),
                level_5 = findViewById(R.id.level_5),
                level_6 = findViewById(R.id.level_6),
                level_7 = findViewById(R.id.level_7),
                level_8 = findViewById(R.id.level_8);

        level_list = new LinearLayout[]{
                level_1, level_2, level_3, level_4, level_5, level_6, level_7, level_8
        };

        setAllLevelButtonListeners();

    }


    private void backGroundSetter(LinearLayout currentLevel) {
        for (LinearLayout curLayout : level_list) {
            if (curLayout == currentLevel)
                currentLevel.setBackgroundResource(R.drawable.round_back_white_stroke10);
            else
                curLayout.setBackgroundResource(R.drawable.round_back_red);
        }
    }

    private void setAllLevelButtonListeners() {
        for (LinearLayout curLayout : level_list) {
            curLayout.setOnClickListener(v -> backGroundSetter(curLayout));
        }
    }

    public void startMenuActivityFromLevelMenu(View view) {
        Intent startMainMenu = new Intent(this, MainMenu.class);
        startActivity(startMainMenu);
        finish();
    }
}