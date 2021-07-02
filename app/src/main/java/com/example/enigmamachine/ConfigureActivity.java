package com.example.enigmamachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConfigureActivity extends AppCompatActivity {

    public HashMap<String, String> plugBoard = new HashMap<String, String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configure);
        rotors();


    }

    public void getInput(View v) {

        Spinner firstRotorSpinner = findViewById(R.id.rotor_first);
        Spinner secondRotorSpinner = findViewById(R.id.rotor_second);
        Spinner thirdRotorSpinner = findViewById(R.id.rotor_third);

        EditText input = findViewById(R.id.plugboard_input_configure);
        String inputedPairs = input.getText().toString();
        String[] arr = inputedPairs.split(" ");

        for(String pairs : arr) {
            int n = pairs.length();
            char first = pairs.charAt(0);
            char second = pairs.charAt(n-1);
            plugBoard.put(Character.toString(first), Character.toString(second));
        }



        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("plugboard", plugBoard);

        int[] rotorsArray = initializeSpinners(firstRotorSpinner, secondRotorSpinner, thirdRotorSpinner);
        intent.putExtra("rotors", rotorsArray);
        startActivity(intent);
    }

    public void goBack(View v) {

        this.finish();

    }

    public void rotors() {

        Spinner firstRotorSpinner = findViewById(R.id.rotor_first);
        Spinner secondRotorSpinner = findViewById(R.id.rotor_second);
        Spinner thirdRotorSpinner = findViewById(R.id.rotor_third);


        List<RotorPositions> rotorPositionsList = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            RotorPositions rotorPosition = new RotorPositions(Integer.toString(i), i);
            rotorPositionsList.add(rotorPosition);
        }

        ArrayAdapter<RotorPositions> adapter = new ArrayAdapter<>(this, R.layout.spinner_item, rotorPositionsList);
        adapter.setDropDownViewResource(R.layout.spinner_item);

        firstRotorSpinner.setAdapter(adapter);
        secondRotorSpinner.setAdapter(adapter);
        thirdRotorSpinner.setAdapter(adapter);

    }

    public int getPosition(RotorPositions rotorPositions) {
        int value = rotorPositions.getValue();
        return value;
    }



    public int[] initializeSpinners(Spinner firstRotorSpinner, Spinner secondRotorSpinner, Spinner thirdRotorSpinner) {


        RotorPositions firstRotorPosition = (RotorPositions) firstRotorSpinner.getSelectedItem();
        RotorPositions secondRotorPosition = (RotorPositions) secondRotorSpinner.getSelectedItem();
        RotorPositions thirdRotorPosition = (RotorPositions) thirdRotorSpinner.getSelectedItem();
//
        int firstPosition = getPosition(firstRotorPosition);
        int secondPosition = getPosition(secondRotorPosition);
        int thirdPosition = getPosition(thirdRotorPosition);

        int[] positions = {firstPosition, secondPosition, thirdPosition};

        return positions;
    }


}