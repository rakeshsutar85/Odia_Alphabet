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

        Button button21 = (Button) this.findViewById(R.id.button_21);
        final MediaPlayer mp21 = MediaPlayer.create(this, R.raw.alphabet_4);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp21.start();
            }
        });

        Button button22 = (Button) this.findViewById(R.id.button_22);
        final MediaPlayer mp22 = MediaPlayer.create(this, R.raw.alphabet_5);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp22.start();
            }
        });

        Button button23 = (Button) this.findViewById(R.id.button_23);
        final MediaPlayer mp23 = MediaPlayer.create(this, R.raw.alphabet_6);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp23.start();
            }
        });

        Button button31 = (Button) this.findViewById(R.id.button_31);
        final MediaPlayer mp31 = MediaPlayer.create(this, R.raw.alphabet_7);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp31.start();
            }
        });

        Button button32 = (Button) this.findViewById(R.id.button_32);
        final MediaPlayer mp32 = MediaPlayer.create(this, R.raw.alphabet_8);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp32.start();
            }
        });

        Button button33 = (Button) this.findViewById(R.id.button_33);
        final MediaPlayer mp33 = MediaPlayer.create(this, R.raw.alphabet_9);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp33.start();
            }
        });

        Button button41 = (Button) this.findViewById(R.id.button_41);
        final MediaPlayer mp41 = MediaPlayer.create(this, R.raw.alphabet_10);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp41.start();
            }
        });

        Button button42 = (Button) this.findViewById(R.id.button_42);
        final MediaPlayer mp42 = MediaPlayer.create(this, R.raw.alphabet_11);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp42.start();
            }
        });

        Button button43 = (Button) this.findViewById(R.id.button_43);
        final MediaPlayer mp43 = MediaPlayer.create(this, R.raw.alphabet_12);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp43.start();
            }
        });

        Button button51 = (Button) this.findViewById(R.id.button_51);
        final MediaPlayer mp51 = MediaPlayer.create(this, R.raw.alphabet_13);
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp51.start();
            }
        });

        Button button52 = (Button) this.findViewById(R.id.button_52);
        final MediaPlayer mp52 = MediaPlayer.create(this, R.raw.alphabet_14);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp52.start();
            }
        });

        Button button53 = (Button) this.findViewById(R.id.button_53);
        final MediaPlayer mp53 = MediaPlayer.create(this, R.raw.alphabet_15);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp53.start();
            }
        });



    }
}