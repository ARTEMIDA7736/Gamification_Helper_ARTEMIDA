package com.example.gamification_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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

        level_list = new LinearLayout[] {
                level_1, level_2, level_3, level_4,
                level_5, level_6, level_7, level_8
        };

        setAllLevelButtonListeners();

    }


    private void backGroundSetter(LinearLayout currentLevel) {
        for (LinearLayout curLayout : level_list) {
            if (curLayout == currentLevel) {
                currentLevel.setBackgroundResource(R.drawable.round_back_white_stroke10);
                int chosenLevel = (int) currentLevel.getTag(),
                    currentPlayerLevel = DataBaseGetter.getLevel() + 1;
                if (currentPlayerLevel <= chosenLevel) {
                    Toast toast = Toast.makeText(this, "Сперва пройдите уровень " + currentPlayerLevel + "!", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.TOP, 0,160);   // import android.view.Gravity;
                    toast.show();
                }
            }
            else
                curLayout.setBackgroundResource(R.drawable.round_back_red);
        }
    }

    private void setAllLevelButtonListeners() {
        int i = 0;
        for (LinearLayout curLayout : level_list) {
            curLayout.setOnClickListener(v -> backGroundSetter(curLayout));
            curLayout.setTag(i++);
        }
    }

    public void startMenuActivityFromLevelMenu(View view) {
        Intent startMainMenu = new Intent(this, MainMenu.class);
        startActivity(startMainMenu);
        finish();
    }
}