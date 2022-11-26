package com.example.gamification_helper;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DataBaseGetter {
    static int getLevel() {
        int levelFake = 4;
        return levelFake;
    }

    private void increaseLevel(int count) { return; }

    static int getCoins() {
        int coinsFake = 3;
        return coinsFake;
    }

    private void increaseCoins(int count) { return; }

    static String getStatus() {
        String fakeStatus = "Статус";
        return fakeStatus;
    }

    private void makeNewStatus(String newStatus) { return; }

    static void makeNewAvatar(ImageView avatarImageView, Drawable newAvatar) {
        avatarImageView.setImageDrawable(newAvatar);
    }
}
