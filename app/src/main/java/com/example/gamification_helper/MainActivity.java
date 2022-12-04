package com.example.gamification_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button toMainMenu;
    static SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toMainMenu = findViewById(R.id.fromMainToMenu);

        db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
        DataBaseGetter.initDataBase();
    }

    public void StartMenuActivity(View view) {
        Intent startMainMenu = new Intent(this, MainMenu.class);
        startActivity(startMainMenu);

}}