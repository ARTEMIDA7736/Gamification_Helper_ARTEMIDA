package com.example.gamification_helper;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DataBaseGetter {
    static SQLiteDatabase db = MainActivity.db;
    static Cursor queryUsers, queryAchievements;
    static int[] avatarsDrawable = new int[]{
            R.drawable.frog_kyi1y4kk5ap9,
            R.drawable.alien_94cbcc2kzvti,
            R.drawable.knight_uk6woeyexy7p,
            R.drawable.monster_cukoa9qsxmp0,
            R.drawable.rapper_yjf2xnpd4p2f,
            R.drawable.zombie_ogjg6h1r9eb8,
            R.drawable.rat_8fojzyg8yvpl,
            R.drawable.spaceman_dtv71bg3oumg,
            R.drawable.thief_czzr913kcaxs
    };

    static void initDataBase() {
        db.execSQL("CREATE TABLE IF NOT EXISTS users " +
                "(name TEXT, level INTEGER, money INTEGER," +
                "avatar INTEGER, status TEXT, UNIQUE(name))"
        );
        db.execSQL("INSERT OR IGNORE INTO users VALUES " +
                "('ARTEMIDA7736',4,2500,0,'GANGSTAKILLER')," +
                "('mihamix', 31, 1000, 4, 'Poor');"
        );
        db.execSQL("CREATE TABLE IF NOT EXISTS achievements " +
                "(name TEXT, description TEXT, lock INTEGER, UNIQUE(name))"
        );
        db.execSQL("INSERT OR IGNORE INTO achievements VALUES " +
                "('Kill monsters','done thx', 0)," +
                "('Do household chores', 'Must do!', 0);"
        );
        updateUsers();
    }

    // Users Table
    static int getLevel() { return queryUsers.getInt(1); }

    private void updateLevel(int newLevel) {
        db.execSQL("UPDATE users SET level = " + newLevel + ";");
        updateUsers();
    }

    static int getCoins() { return queryUsers.getInt(2); }

    private void updateCoins(int count) {
        db.execSQL("UPDATE users SET money = " + count + ";");
        updateUsers();
    }

    static String getStatus() { return queryUsers.getString(4); }

    private void makeNewStatus(String newStatus) {
        db.execSQL("UPDATE users SET status = " + newStatus + ";");
        updateUsers();
    }

    static int getAvatarId() { return queryUsers.getInt(3); }

    static void changeAvatar(int newAvatar) {
        db.execSQL("UPDATE users SET avatar = " + newAvatar + ";");
        updateUsers();
    }

    static void updateUsers() {
        queryUsers = db.rawQuery("SELECT * FROM users;", null);
        queryUsers.moveToFirst();
    }

    // Achievement Table

}
