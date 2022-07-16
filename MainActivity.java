package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity{

    EditText username, email, mobile, password;


    Spinner spinner;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // retrieve data
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        mobile = findViewById(R.id.mobile);
        password = findViewById(R.id.password);




        Spinner spinner = findViewById(R.id.spinner);

        //Create an ArrayAdapter using the String array and a default spinner layout
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this, R.array.Hobbies, android.R.layout.simple_spinner_item);

        //Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Apply the adapter to the spinner
        spinner.setAdapter(adapter);

    }
    public void Submit(View view){
        String u = username.getText().toString().trim();
        String e = email.getText().toString().trim();
        String m = mobile.getText().toString().trim();
        String p = password.getText().toString().trim();



        // jump one activity to another activity
        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
        intent.putExtra("user",u);
        intent.putExtra("email",e);
        intent.putExtra("mobile",m);
        intent.putExtra("pass",p);

        startActivity(intent);

    }

}