package com.example.registrationform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSignUpClick (View view) {
        // Declaring objects to extract information from Views:
        EditText editTextUsername = findViewById(R.id.editTextUsername);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextPassword= findViewById(R.id.editTextPassword);
        TextView textViewUsername = findViewById(R.id.textViewUsername);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        TextView textViewPassword = findViewById(R.id.textViewPassword);

        // Change View information according to the information input by the user.
        textViewUsername.setText("User: " + editTextUsername.getText().toString());
        textViewEmail.setText("E-mail: " + editTextEmail.getText().toString());
        textViewPassword.setText("Password: " + editTextPassword.getText().toString());


    }
}