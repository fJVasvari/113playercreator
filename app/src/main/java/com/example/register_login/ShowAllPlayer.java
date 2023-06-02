package com.example.register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.register_login.player.Player;

import java.util.ArrayList;

public class ShowAllPlayer extends AppCompatActivity {

    Spinner playerNameSpinner;
    TextView pClass, pGender, pHealth, pDamage, pDefense;
    Button updateBtn, DeleteBtn;
    ArrayList<String> playerNameList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_player);

        playerNameSpinner = findViewById(R.id.playerNameSpinner);

        pClass = findViewById(R.id.classTextView);
        pGender = findViewById(R.id.genderTextView);
        pHealth = findViewById(R.id.healthTextView);
        pDamage = findViewById(R.id.damageTextView);
        pDefense = findViewById(R.id.defenseTextView);

        updateBtn = findViewById(R.id.updateBtn);
        DeleteBtn = findViewById(R.id.deleteBtn);

        playerNameList.add("Jóska");
        playerNameList.add("Pista");
        playerNameList.add("Juli");

        Player player = new Player("Jóska","Barbarian","Male");
        Player player2 = new Player("Pista","Mage","Other");
        Player player3 = new Player("Juli","Necromancer","Female");

        ArrayAdapter<String> playerNameAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, playerNameList);
        playerNameSpinner.setAdapter(playerNameAdapter);
        playerNameSpinner.setSelection(0);

        if(playerNameSpinner.getSelectedItem().toString().equals("Jóska")){
            pClass.setText(player.getpClass().toString());
            pGender.setText(player.getpGender().toString());
            pHealth.setText(Integer.toString(player.getpHealth()));
            pDamage.setText(Integer.toString(player.getpDamage()));
            pDefense.setText(Integer.toString(player.getpDefense()));

        }else if(playerNameSpinner.getSelectedItem().toString().equals("Pista")){
            pClass.setText(player2.getpClass().toString());
            pGender.setText(player2.getpGender().toString());
            pHealth.setText(Integer.toString(player2.getpHealth()));
            pDamage.setText(Integer.toString(player2.getpDamage()));
            pDefense.setText(Integer.toString(player2.getpDefense()));
        }else{
            pClass.setText(player3.getpClass().toString());
            pGender.setText(player3.getpGender().toString());
            pHealth.setText(Integer.toString(player3.getpHealth()));
            pDamage.setText(Integer.toString(player3.getpDamage()));
            pDefense.setText(Integer.toString(player3.getpDefense()));
        }

    }
}