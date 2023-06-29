package com.gmail.rakeshsutar85.odiaalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button11 = (Button) this.findViewById(R.id.button_11);
        final MediaPlayer mp11 = MediaPlayer.create(this, R.raw.alphabet_1);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp11.start();
            }
        });

        Button button12 = (Button) this.findViewById(R.id.button_12);
        final MediaPlayer mp12 = MediaPlayer.create(this, R.raw.alphabet_2);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp12.start();
            }
        });

        Button button13 = (Button) this.findViewById(R.id.button_13);
        final MediaPlayer mp13 = MediaPlayer.create(this, R.raw.alphabet_3);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp13.start();
            }
        });
    }
}