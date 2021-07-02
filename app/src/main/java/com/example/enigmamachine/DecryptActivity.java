package com.example.enigmamachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class DecryptActivity extends AppCompatActivity {

    public String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);
    }

    public void keyPress(View v) {


        Intent intent = getIntent();
        int[] rotorConfiguredPositions = intent.getIntArrayExtra("rotored");

        int firstRotorPosition = rotorConfiguredPositions[0];
        int secondRotorPosition = rotorConfiguredPositions[1];
        int thirdRotorPosition = rotorConfiguredPositions[2];

        Button button = (Button) v;
        String preInput = button.getText().toString();

        String thirdRotorOutput = rotorLast(preInput, thirdRotorPosition);
        String secondRotorOutput = rotorSecond(thirdRotorOutput, secondRotorPosition);
        String firstRotorOutput = rotorFirst(secondRotorOutput, firstRotorPosition);
        String afterPlug = outputPlugged(firstRotorOutput);

        output(afterPlug, firstRotorOutput,secondRotorOutput, thirdRotorOutput);

    }

    public String outputPlugged(String input){

        String outputs = "";
        Intent intent = getIntent();
        HashMap<String, String> test = (HashMap<String, String>) intent.getSerializableExtra("pluged");

        for (Map.Entry plugs : test.entrySet()) { // this loop itirates through map
            if (input.equals((String)plugs.getKey())) { // checks for keys and if matched gets value and changes that to output
                outputs = outputs + plugs.getValue();
            } else if(input.equals((String)plugs.getValue())) { // checks for values if keys aren't matched and gets key and changes that to output
                outputs = outputs + plugs.getKey();
            }
        }

        return outputs;
    }

    public void output(String plugboard, String firstRotor, String secondRotor, String thirdRotor) {

        // output plug
        TextView outputPlugView = findViewById(R.id.output_plugboard_decrypt); // plugboard View
        String outputString = outputPlugView.getText().toString(); // plugboard get Text
        outputString = outputString + plugboard; // add output to plugboard output
        outputPlugView.setText(outputString); // set result

        // output firstRotor
        TextView outputFirstRotorView = findViewById(R.id.output_first_rotor_decrypt);
        String outputFirstRotorString = outputFirstRotorView.getText().toString();
        outputFirstRotorString = outputFirstRotorString + firstRotor;
        outputFirstRotorView.setText(outputFirstRotorString);

        // output secondRotor
        TextView outputSecondRotorView = findViewById(R.id.output_second_rotor_decrypt);
        String outputSecondRotorString = outputSecondRotorView.getText().toString();
        outputSecondRotorString = outputSecondRotorString + secondRotor;
        outputSecondRotorView.setText(outputSecondRotorString);

        //output thirdRotor
        TextView outputThirdRotor = findViewById(R.id.output_third_rotor_decrypt);
        String outputThirdRotorString = outputThirdRotor.getText().toString();
        outputThirdRotorString = outputThirdRotorString + thirdRotor;
        outputThirdRotor.setText(outputThirdRotorString);


    }

    public String rotorFirst(String input, int rotorPos) {
        int outputPos = 0;
        String[] randAlphabetArray = {"s","a","k","c","t","r","z","n","b","u","l","g","m","f","p","v","e","j","d","i","x","y","h","o","w","q"};
        String[] turnedRotor = rotateArray(randAlphabetArray, rotorPos);
        for (int i = 0; i<alphabet.length; i++) {
            if (input.equals(turnedRotor[i])) {
                outputPos = outputPos + i;
            }
        }
        return alphabet[outputPos];
    }

    public String rotorSecond(String input, int rotorPos) {
        int outputPos = 0;
        String[] randAlphabetArray = {"j","r","w","c","i","b","g","a","q","t","f","e","o","p","v","s","u","m","d","h","l","y","n","k","x","z","z"};
        String[] turnedRotor = rotateArray(randAlphabetArray, rotorPos);
        for (int i = 0; i<alphabet.length; i++) {
            if (input.equals(turnedRotor[i])) {
                outputPos = outputPos + i;
            }
        }
        return alphabet[outputPos];
    }

    public String rotorLast(String input, int rotorPos) {
        int outputPos = 0;
        String[] randAlphabetArray = {"j","z","b","i","w","u","v","o","a","c","d","k","g","n","f","x","l","r","q","y","e","h","s","m","p","t","b"};
        String[] turnedRotor = rotateArray(randAlphabetArray, rotorPos);
        for (int i = 0; i<alphabet.length; i++) {
            if (input.equals(turnedRotor[i])) {
                outputPos = outputPos + i;
            }
        }
        return alphabet[outputPos];
    }

    public String[] rotateArray(String[] randArray, int rotorPosition) {
        String[] turnedRotor = new String[randArray.length];
        for (int i = 0; i < rotorPosition; i++) {
            for (int j = 0; j < randArray.length - 1; j++) {
                turnedRotor[j + 1] = randArray[j];
            }
            turnedRotor[0] = randArray[randArray.length-1];
        }
        return turnedRotor;
    }
    public void goBack(View v) {

        this.finish();

    }

}