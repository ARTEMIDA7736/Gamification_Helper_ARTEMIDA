package com.example.gamification_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Achievments_Activity extends AppCompatActivity {
    private TextView coinViewAchievements, levelViewAchievements,
            achiev1, achiev2, achiev3, achiev4;
    ImageView avatarImage;
    TextView[] listOfAchieve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievments);

        coinViewAchievements = findViewById(R.id.CoinCounterAchievements);
        levelViewAchievements = findViewById(R.id.LevelCounterAchievements);
        avatarImage = findViewById(R.id.avatarView);
        HatMaker.makeHat(levelViewAchievements, coinViewAchievements, avatarImage);
        avatarImage.setOnClickListener(view -> startAvatarActivityFromAchievementMenu());
        achiev1 = findViewById(R.id.ach1);
        achiev2 = findViewById(R.id.ach2);
        achiev3 = findViewById(R.id.ach3);
        achiev4 = findViewById(R.id.ach4);
        listOfAchieve = new TextView[] {
                achiev1, achiev2, achiev3, achiev4
        };

        for (int i = 0; i < listOfAchieve.length; i++) {
            if (DataBaseGetter.isUnlockedAchievement(i) == 1)
                listOfAchieve[i].setText("Unlocked");
        }
    }

    public void startMenuActivityFromAchievements(View view) {
        Intent startMainMenu = new Intent(this, MainMenu.class);
        startActivity(startMainMenu);
        finish();
    }

    public void startAvatarActivityFromAchievementMenu() {
        Intent startAvatarMenu = new Intent(this, Avatar_Menu.class);
        startActivity(startAvatarMenu);
    }
}