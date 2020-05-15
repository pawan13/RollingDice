package com.pk.rollingdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView rollingDice;
    Button RollDice;
    int number;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollingDice = findViewById(R.id.imageView_dice);
        RollDice = findViewById(R.id.button_Roll);

        r = new Random();
        RollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = r.nextInt(6) + 1;
                if (number == 1) {
                    rollingDice.setImageResource(R.drawable.a);
                } else if (number == 2) {
                    rollingDice.setImageResource(R.drawable.b);
                } else if (number == 3) {
                    rollingDice.setImageResource(R.drawable.c);
                } else if (number == 4) {
                    rollingDice.setImageResource(R.drawable.d);
                } else if (number == 5) {
                    rollingDice.setImageResource(R.drawable.e);
                } else if (number == 6) {
                    rollingDice.setImageResource(R.drawable.f);
                }
                Toast.makeText(MainActivity.this,"Dice is rolled!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
