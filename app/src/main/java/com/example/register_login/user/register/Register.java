package com.example.register_login.user.register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.register_login.MainActivity;
import com.example.register_login.R;
import com.example.register_login.user.User;
import com.example.register_login.user.login.Login;

public class Register extends AppCompatActivity {

    TextView loginText;
    EditText fullnameEditText, emailEditText, usernameEditText, passwordEditText;
    Button registerButton;
    RegisterUser registerUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerUser = new RegisterUser();

        loginText = findViewById(R.id.backToLoginTextView);

        fullnameEditText = findViewById(R.id.editTextTextPersonName);
        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        usernameEditText = findViewById(R.id.editTextUsername);
        passwordEditText = findViewById(R.id.editTextTextPassword);

        registerButton = findViewById(R.id.registerBtn);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(String.valueOf(fullnameEditText.getText())
                        ,String.valueOf(usernameEditText.getText())
                        ,String.valueOf(emailEditText.getText())
                                ,String.valueOf(passwordEditText.getText()));
                registerUser.putDataToDB(user,getApplicationContext());
            }
        });
        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });

    }
}