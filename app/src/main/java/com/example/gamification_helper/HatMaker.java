package com.example.gamification_helper;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

public class HatMaker extends DataBaseGetter {
    private static int coinCounter, currentLevel, avatarImage;
    private static String currentStatus;

    private static void makeCoinCounter(TextView coinCounterView) {
        coinCounter = DataBaseGetter.getCoins();
        coinCounterView.setText(
                String.format("%d$", coinCounter)
        );
    }

    private static void makeCurrentLevel(TextView levelView) {
        currentLevel = DataBaseGetter.getLevel();
        levelView.setText(
                String.format("Ваш уровень: %d", currentLevel)
        );
    }

    private static void makeCurrentStatus(TextView levelView) {
        currentStatus = DataBaseGetter.getStatus();
        levelView.setText(
                String.format("%s", currentStatus)
        );
    }

    static void makeCurrentAvatar(ImageView avatarView) {
        avatarImage = DataBaseGetter.getAvatarId();
        avatarView.setImageResource(
                DataBaseGetter.avatarsDrawable[avatarImage]
        );
    }

    static void makeHat(TextView levelView, TextView coinCounterView, ImageView avatarView) {
        makeCoinCounter(coinCounterView);
        makeCurrentStatus(levelView);
        makeCurrentAvatar(avatarView);
    }
}
