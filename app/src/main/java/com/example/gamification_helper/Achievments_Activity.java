package com.example.gamification_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Achievments_Activity extends AppCompatActivity {
    private TextView coinViewAchievements, levelViewAchievements;
    ImageView avatarImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievments);

        coinViewAchievements = findViewById(R.id.CoinCounterAchievements);
        levelViewAchievements = findViewById(R.id.LevelCounterAchievements);
        avatarImage = findViewById(R.id.avatarView);
        HatMaker.makeHat(levelViewAchievements, coinViewAchievements, avatarImage);
        avatarImage.setOnClickListener(view -> startAvatarActivityFromAchievementMenu());
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