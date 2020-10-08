package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** This function will be called when the user taps the Send button **/
    public void sendMessage (View view) {
        // Declaration of Intent
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //Define EditText object from the actual editText from the activity_main.xml
        EditText editText = (EditText) findViewById(R.id.editText);

        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}