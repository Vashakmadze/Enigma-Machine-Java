package com.example.enigmamachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    public HashMap<String, String> plugBoard = new HashMap<String, String>();
    public int[] rotorPositions = new int[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getConfiguration();
    }

    public void getConfiguration() {
        Intent intent = getIntent();
        HashMap<String, String> configuration =(HashMap<String, String>) intent.getSerializableExtra("plugboard");
        int[] positions = intent.getIntArrayExtra("rotors");
        plugBoard = configuration;
        rotorPositions = positions;

    }

    public void goToEncrypt(View V) {
        Intent intent = new Intent(this, EncryptActivity.class);
        intent.putExtra("pluged", plugBoard);
        intent.putExtra("rotored", rotorPositions);
        startActivity(intent);
    }

    public void goToDencrypt(View V) {
        Intent intent = new Intent(this, DecryptActivity.class);
        intent.putExtra("pluged", plugBoard);
        intent.putExtra("rotored", rotorPositions);
        startActivity(intent);
    }

    public void goToConfigure(View V) {
        Intent intent = new Intent(this, ConfigureActivity.class);
        intent.putExtra("pluged", plugBoard);
        intent.putExtra("rotored", rotorPositions);
        startActivity(intent);
    }


}