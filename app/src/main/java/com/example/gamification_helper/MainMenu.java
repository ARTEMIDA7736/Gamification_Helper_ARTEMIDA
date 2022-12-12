package com.example.gamification_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {
    private TextView coinViewMainMenu, levelViewMainMenu;
    private ImageView avatarImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        coinViewMainMenu = findViewById(R.id.CoinCounterMainMenu);
        levelViewMainMenu = findViewById(R.id.LevelCounterMainMenu);
        avatarImage = findViewById(R.id.avatarView);
        HatMaker.makeHat(levelViewMainMenu, coinViewMainMenu, avatarImage);
        avatarImage.setOnClickListener(view -> startAvatarActivityFromMainMenu());
    }

    @Override
    protected void onResume() {
        super.onResume();
        HatMaker.makeHat(levelViewMainMenu, coinViewMainMenu, avatarImage);
    }

    public void startAvatarActivityFromMainMenu() {
        Intent startAvatarMenu = new Intent(this, Avatar_Menu.class);
        startActivity(startAvatarMenu);
    }

    public void startAchievementActivityFromMainMenu(View view) {
        Intent startAchievementMenu = new Intent(this, Achievments_Activity.class);
        startActivity(startAchievementMenu);
    }

    public void startLevelActivityFromMainMenu(View view) {
        Intent startLevelMenu = new Intent(this, Level_Menu.class);
        startActivity(startLevelMenu);
    }
}