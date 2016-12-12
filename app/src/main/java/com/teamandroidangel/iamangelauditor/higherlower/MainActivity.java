package com.teamandroidangel.iamangelauditor.higherlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int number;

    public void clickButton (View view) {

        EditText numberGuess = (EditText) findViewById(R.id.numberGuess);

        String numberGuessString = numberGuess.getText().toString();
        int numberGuessInt = Integer.parseInt(numberGuessString);

        String message = "";
        if (numberGuessInt > number) {
            message = " Too High!";
        } else if (numberGuessInt < number) {
            message = "Too Low!";

        } else {

            message = "Correct";
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random fileGenerator = new Random();
         number = fileGenerator.nextInt(10);


    }
}
