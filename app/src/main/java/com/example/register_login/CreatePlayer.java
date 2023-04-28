package com.example.register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class CreatePlayer extends AppCompatActivity {

    Spinner playerClassSpinner, playerGenderSpinner;

    ArrayList<String> playerClassList = new ArrayList<>();
    ArrayList<String> playerGenderList = new ArrayList<>();

    TextView playerHealthText, playerDamageText, playerDefenseText, playerRemainingStatPointText;

    int RemainingStatPoint = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_player);
//Set adapter
        playerClassSpinner = findViewById(R.id.playerClassSpinner);
        playerGenderSpinner = findViewById(R.id.playerGenderSpinner);

        playerClassList.add("Barbarian");
        playerClassList.add("Mage");
        playerClassList.add("Necromancer");

        playerGenderList.add("Male");
        playerGenderList.add("Female");
        playerGenderList.add("Other");

        ArrayAdapter<String> playerClassAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, playerClassList);
        playerClassSpinner.setAdapter(playerClassAdapter);
        ArrayAdapter<String> playerGenderAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, playerGenderList);
        playerGenderSpinner.setAdapter(playerGenderAdapter);

//Set Stat point text

        playerHealthText = findViewById(R.id.playerHealthText);
        playerDamageText = findViewById(R.id.playerDamageText);
        playerDefenseText = findViewById(R.id.playerDefenseText);
        playerRemainingStatPointText = findViewById(R.id.playerRemainingStatPointText);

        playerHealthText.setText("");
        playerDamageText.setText("");
        playerDefenseText.setText("");
        playerRemainingStatPointText.setText(""+RemainingStatPoint);
    }
}