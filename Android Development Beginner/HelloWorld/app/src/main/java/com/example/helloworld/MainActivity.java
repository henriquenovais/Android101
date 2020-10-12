package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

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


    public void onBtnClick(View view) {
        // Get display message view information
        TextView txtMessage = findViewById(R.id.txtMessage);
        // Get input text view information
        EditText txtInput = findViewById(R.id.txtInput);
        // Display input text into txtMessage object:
        txtMessage.setText(txtInput.getText().toString());
    }
}