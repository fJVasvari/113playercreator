package com.example.register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class CreatePlayer extends AppCompatActivity {

    Spinner playerClassSpinner, playerGenderSpinner;

    ArrayList<String> playerClassList = new ArrayList<>();
    ArrayList<String> playerGenderList = new ArrayList<>();

    TextView playerHealthText, playerDamageText, playerDefenseText, playerRemainingStatPointText;

    Button createPlayerBtn, playerHealthPlusBtn, playerDamagePlusBtn, playerDefensePlusBtn, playerHealthMinusBtn, playerDamageMinusBtn, playerDefenseMinusBtn;

    int remainingStatPoint = 10;
    int playerHealthPoint = 1;
    int playerDamagePoint = 1;
    int playerDefensePoint = 1;

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

        playerHealthText.setText(""+playerHealthPoint);
        playerDamageText.setText(""+playerDamagePoint);
        playerDefenseText.setText(""+playerDefensePoint);
        playerRemainingStatPointText.setText(""+remainingStatPoint);

//Stat point manager

        createPlayerBtn = findViewById(R.id.createPlayerBtn);
        playerHealthPlusBtn = findViewById(R.id.playerHealthPlusBtn);
        playerDamagePlusBtn = findViewById(R.id.playerDamagePlusBtn);
        playerDefensePlusBtn = findViewById(R.id.playerDefensePlusBtn);
        playerHealthMinusBtn = findViewById(R.id.playerHealthMinusBtn);
        playerDamageMinusBtn = findViewById(R.id.playerDamageMinusBtn);
        playerDefenseMinusBtn = findViewById(R.id.playerDefenseMinusBtn);

        playerHealthPlusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(remainingStatPoint>=1) {
                    remainingStatPoint -= 1;
                    playerHealthPoint += 1;
                    playerHealthText.setText("" + playerHealthPoint);
                    playerRemainingStatPointText.setText("" + remainingStatPoint);
                }
            }
        });
        playerHealthMinusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(playerHealthPoint>1){
                    playerHealthPoint -= 1;
                    remainingStatPoint += 1;
                    playerHealthText.setText("" + playerHealthPoint);
                    playerRemainingStatPointText.setText("" + remainingStatPoint);
                }
            }
        });
    }
}