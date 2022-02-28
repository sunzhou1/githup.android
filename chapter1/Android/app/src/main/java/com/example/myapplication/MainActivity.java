package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button trueBtn = findViewById(R.id.true_button);
        final Button flaseBtn = findViewById(R.id.flase_button);
        trueBtn.setOnClickListener(view ->{
           Toast.makeText(this,"correct",Toast.LENGTH_SHORT).show();
           Toast.makeText(this,R.string.correct_toast,Toast.LENGTH_SHORT).show();
        });
        flaseBtn.setOnClickListener(view -> {
            Toast.makeText(this,"incorrect",Toast.LENGTH_SHORT).show();
            Toast.makeText(this,R.string.incorrect_toast,Toast.LENGTH_SHORT).show();
        });
    }
}