package com.example.gamescore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int score1 = 0;
    private int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textScore1 = findViewById(R.id.textViewScore1);
        TextView textScore2 = findViewById(R.id.textViewScore2);

        textScore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textScore1.setText(String.valueOf(++score1));
            }
        });

        textScore2.setOnClickListener(v -> textScore2.setText(String.valueOf(++score2)));
    }
}