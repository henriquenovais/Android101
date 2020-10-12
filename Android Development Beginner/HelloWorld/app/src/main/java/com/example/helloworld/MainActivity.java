package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtMessage = findViewById(R.id.txtMessage);
        TextView txtInput = findViewById(R.id.txtInput);
    }


    public void onBtnClick(View view) {

        TextView txtMessage = findViewById(R.id.txtMessage);
        TextView txtInput = findViewById(R.id.txtInput);

        String txt = (String) txtInput.getText();
        txtMessage.setText(txt);
    }
}