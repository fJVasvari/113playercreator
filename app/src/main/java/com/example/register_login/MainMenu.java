package com.example.register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.register_login.player.CreatePlayer;

public class MainMenu extends AppCompatActivity {

    Button goToCreatePlayer,showPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        goToCreatePlayer = findViewById(R.id.goToCreatePlayer);
        showPlayers = findViewById(R.id.showPlayers);

        goToCreatePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CreatePlayer.class);
                startActivity(intent);
                finish();
            }
        });

        showPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShowAllPlayer.class);
                startActivity(intent);
                finish();
            }
        });



    }
}