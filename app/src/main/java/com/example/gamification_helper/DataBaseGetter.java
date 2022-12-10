package com.example.gamification_helper;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DataBaseGetter {
    static SQLiteDatabase db = MainActivity.db;
    static Cursor queryUsers, queryAchievements;
    static int[] avatarsDrawable = new int[]{
            R.drawable.avatar1,
            R.drawable.avatar2,
            R.drawable.avatar3,
            R.drawable.avatar4,
            R.drawable.avatar5,
            R.drawable.avatar6,
            R.drawable.avatar7,
            R.drawable.avatar8,
            R.drawable.avatar9,
            R.drawable.avatar10,
            R.drawable.avatar11,
            R.drawable.avatar12,
    };

    static void initDataBase() {
        db.execSQL("CREATE TABLE IF NOT EXISTS users " +
                "(name TEXT, level INTEGER, money INTEGER," +
                "avatar INTEGER, status TEXT, UNIQUE(name))"
        );
        db.execSQL("INSERT OR IGNORE INTO users VALUES " +
                "('Player', 0, 0, 0, 'Новичок');"
        );
        db.execSQL("CREATE TABLE IF NOT EXISTS achievements " +
                "(name TEXT, description TEXT, number INTEGER, lock INTEGER, UNIQUE(name))"
        );
        db.execSQL("INSERT OR IGNORE INTO achievements VALUES " +
                "('Kill monsters','done thx', 0, 1)," +
                "('Do household chores', 'Must do!', 1, 0)," +
                "('3', 'Must do!', 2, 0)," +
                "('4', 'Must do!', 3, 0)," +
                "('5', 'Must do!', 4, 0)," +
                "('6', 'Must do!', 5, 0);"
        );
        updateUsers();
        updateAchievements();
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

    static void updateAchievements() {
        queryAchievements = db.rawQuery("SELECT * FROM achievements;", null);
        queryAchievements.moveToFirst();
    }

    static void unlockAchievement(int number) {
        db.execSQL(
                "UPDATE achievements SET lock = " + 1 + " WHERE number = " + number + ";"
        );
        updateAchievements();
    }

    static int isUnlockedAchievement(int number) {
        queryAchievements.moveToPosition(number);
        return queryAchievements.getInt(3);
    }
}
