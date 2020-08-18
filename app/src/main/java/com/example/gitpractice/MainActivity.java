package com.example.gitpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Hey Juju!
        Toast.makeText(MainActivity.this,"Hiii Momo",Toast.LENGTH_LONG).show();
    }
}