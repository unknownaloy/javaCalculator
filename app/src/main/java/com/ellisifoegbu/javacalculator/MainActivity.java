package com.ellisifoegbu.javacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public void calculate(View view) {
        Button equalsButton = (Button) view;

        Log.i("Equals button", equalsButton.getTag().toString());
    }

    public void computeDigits(View view) {
        Button compute = (Button) view;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
