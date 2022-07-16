package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textusername);
        textView = findViewById(R.id.textemail);
        textView = findViewById(R.id.textmobile);
        textView = findViewById(R.id.textpassword);


        Intent intent = getIntent();

        String username = intent.getStringExtra("user");
        String email = intent.getStringExtra("email");
        String mobile = intent.getStringExtra("mobile");
        String password = intent.getStringExtra("pass");


        textView.setText("Username "+username);
        textView.setText("EmailID "+email);
        textView.setText("MobileNo "+mobile);
        textView.setText("Password "+password);



    }
}