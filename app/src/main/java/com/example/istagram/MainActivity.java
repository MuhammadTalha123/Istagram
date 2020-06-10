package com.example.istagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View viwe){

        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);

        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        Log.i("info", "Butoon Pressed!");

        Log.i("username", usernameEditText.getText().toString());

        Log.i("password", passwordEditText.getText().toString());

        Toast.makeText(this, "Welcome! " + usernameEditText.getText().toString() + " your password is " + passwordEditText.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}