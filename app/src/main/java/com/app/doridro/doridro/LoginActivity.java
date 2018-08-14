package com.app.doridro.doridro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button singup,login;
    private EditText userNameET, passwardET;
    private String adminName= "admin";
    private String adminPassward ="12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login);
        userNameET = findViewById(R.id.userEmail);
        passwardET = findViewById(R.id.userPassword);

        singup = findViewById(R.id.register);

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),User_Registation.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = userNameET.getText().toString();
                String passward = passwardET.getText().toString();

                Intent intentAdmin = new Intent(LoginActivity.this,AdminPanel.class);

                if (adminName.equals(userName) && adminPassward.equals(passward)){
                    startActivity(intentAdmin);
                }
                else {
                    Toast.makeText(LoginActivity.this, R.string.admin_intent_error_msg, Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
