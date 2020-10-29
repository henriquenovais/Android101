package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHelloButtonClicked(View view){
        TextView TextViewWelcome = findViewById(R.id.TextViewWelcome);
        TextViewWelcome.setText("Hello Again");
    }
}