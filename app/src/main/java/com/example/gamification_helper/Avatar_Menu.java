package com.example.gamification_helper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Avatar_Menu extends AppCompatActivity {

    private TextView coinViewAvatar, levelViewAvatar;
    private LinearLayout[] avatars;
    ImageView avatarImage;
    private Drawable imageAvatarId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar_menu);

        coinViewAvatar = findViewById(R.id.CoinCounterAvatar);
        levelViewAvatar = findViewById(R.id.LevelCounterAvatar);

        avatarImage = findViewById(R.id.avatarView);
        HatMaker.makeHat(levelViewAvatar, coinViewAvatar, avatarImage);

        final LinearLayout frog = findViewById(R.id.frog),
                alien = findViewById(R.id.alien),
                knight = findViewById(R.id.knight),
                monster = findViewById(R.id.monster),
                rapper = findViewById(R.id.rapper),
                zombie = findViewById(R.id.zombie),
                mouse = findViewById(R.id.mouse),
                spaceman = findViewById(R.id.spaceman),
                stealman = findViewById(R.id.thief);

        avatars = new LinearLayout[]{
                frog, alien, knight, monster, rapper,
                zombie, mouse, spaceman, stealman
        };
        listenerSetter();
    }

    private void listenerSetter() {
        for (LinearLayout curLayout : avatars) {
            curLayout.setOnClickListener(v -> avatarSetter(curLayout));
        }
    }

    private void avatarSetter(LinearLayout chosenAvatar) {
        for (LinearLayout curAvatar : avatars) {
            if (curAvatar == chosenAvatar) {
                ImageView getImageAvatar = (ImageView) curAvatar.getChildAt(0);
                imageAvatarId = getImageAvatar.getDrawable();
                chosenAvatar.setBackgroundResource(R.drawable.round_back_fon);
            }
            else
                curAvatar.setBackgroundResource(R.drawable.round_back_white);
        }
    }

    public void startMenuActivityFromAvatar(View view) {
        Intent startMainMenu = new Intent(this, MainMenu.class);
        startActivity(startMainMenu);
        finish();
    }

    public void acceptNewAvatar(View view) { HatMaker.makeNewAvatar(avatarImage, imageAvatarId);    }
}