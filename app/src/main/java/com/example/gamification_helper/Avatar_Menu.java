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
    private int imageAvatarId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar_menu);

        coinViewAvatar = findViewById(R.id.CoinCounterAvatar);
        levelViewAvatar = findViewById(R.id.LevelCounterAvatar);

        avatarImage = findViewById(R.id.avatarView);
        HatMaker.makeHat(levelViewAvatar, coinViewAvatar, avatarImage);
        final LinearLayout avatar1 = findViewById(R.id.avatar1),
                avatar2 = findViewById(R.id.avatar2),
                avatar3 = findViewById(R.id.avatar3),
                avatar4 = findViewById(R.id.avatar4),
                avatar5 = findViewById(R.id.avatar5),
                avatar6 = findViewById(R.id.avatar6),
                avatar7 = findViewById(R.id.avatar7),
                avatar8 = findViewById(R.id.avatar8),
                avatar9 = findViewById(R.id.avatar9),
                avatar10 = findViewById(R.id.avatar10),
                avatar11 = findViewById(R.id.avatar11),
                avatar12 = findViewById(R.id.avatar12);

        avatars = new LinearLayout[]{
                avatar1, avatar2, avatar3, avatar4,
                avatar5, avatar6, avatar7, avatar8,
                avatar9, avatar10, avatar11, avatar12
        };

        listenerSetter();
    }

    private void listenerSetter() {
        int i = 0;
        for (LinearLayout curLayout : avatars) {
            curLayout.setOnClickListener(v -> avatarSetter(curLayout));
            curLayout.setTag(i++);
        }
    }

    private void avatarSetter(LinearLayout chosenAvatar) {
        for (LinearLayout curAvatar : avatars) {
            if (curAvatar == chosenAvatar) {
                imageAvatarId = (int) chosenAvatar.getTag();
                chosenAvatar.setBackgroundResource(R.drawable.round_back_white_stroke10);
            }
            else
                curAvatar.setBackgroundResource(R.drawable.round_back_red);
        }
    }

    public void startMenuActivityFromAvatar(View view) {
        Intent startMainMenu = new Intent(this, MainMenu.class);
        startActivity(startMainMenu);
        finish();
    }

    public void acceptNewAvatar(View view) {
         DataBaseGetter.changeAvatar(imageAvatarId);
         avatarImage.setImageResource(
                 DataBaseGetter.avatarsDrawable[imageAvatarId]
         );
    }

}