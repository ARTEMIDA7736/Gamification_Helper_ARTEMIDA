package com.example.gamification_helper;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

public class HatMaker extends DataBaseGetter {
    private static int coinCounter, currentLevel;
    private static Drawable avatarImage;


    private static void makeCoinCounter(TextView coinCounterView) {
        coinCounter = DataBaseGetter.getCoins();
        coinCounterView.setText(String.format("Ваша валюта: %d", coinCounter));
    }

    private static void makeCurrentLevel(TextView levelView) {
        currentLevel = DataBaseGetter.getLevel();
        levelView.setText(String.format("Ваш уровень: %d", currentLevel));
    }

    static void makeNewAvatar(Drawable avatarId, ImageView avatarView) {
        avatarView.setImageDrawable(avatarId);
        avatarImage = avatarId;
    }

    static void makeHat(TextView levelView, TextView coinCounterView, ImageView avatarView) {
        makeCoinCounter(coinCounterView);
        makeCurrentLevel(levelView);
        makeNewAvatar(avatarImage, avatarView);
        avatarView.setImageDrawable(avatarImage);
    }
}
