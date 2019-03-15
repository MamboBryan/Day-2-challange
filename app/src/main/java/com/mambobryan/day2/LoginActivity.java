package com.mambobryan.day2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void openDisplayActivity(View view) {

        //Initializes the edittexts and assigns a variable
        EditText emailInput = findViewById(R.id.email_edit_text);
        EditText passwordInput = findViewById(R.id.password_edit_text);

        //gets the edittext value
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();

        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {

            Toast.makeText(this, "Enter Email or Password", Toast.LENGTH_SHORT).show();

        } else if (email.contains("@") && email.contains(".")) {

            Intent myIntentVariable = new Intent(this, DisplayActivity.class);
            myIntentVariable.putExtra("email", email);
            myIntentVariable.putExtra("password", password);
            LoginActivity.this.startActivity(myIntentVariable);

        } else {

            Toast.makeText(this, "Enter valid Email Address", Toast.LENGTH_SHORT).show();

        }

    }

}
