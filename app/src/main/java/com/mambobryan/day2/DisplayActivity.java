package com.mambobryan.day2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView emailTextView = findViewById(R.id.email_text_view);
        TextView passwordTextView = findViewById(R.id.password_text_view);

        Intent activityBIntent = getIntent();
        String userEmail = activityBIntent.getStringExtra("email");
        String userPassword = activityBIntent.getStringExtra("password");

        emailTextView.setText("Email: " + userEmail);
        passwordTextView.setText("Password: " + userPassword);
    }
}