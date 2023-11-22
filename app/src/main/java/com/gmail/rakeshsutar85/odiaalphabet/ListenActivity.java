package com.gmail.rakeshsutar85.odiaalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class ListenActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Button button11 = (Button) this.findViewById(R.id.button_11);
        final MediaPlayer mp11 = MediaPlayer.create(this, R.raw.alphabet_a);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp11.start();
            }
        });

        Button button12 = (Button) this.findViewById(R.id.button_12);
        final MediaPlayer mp12 = MediaPlayer.create(this, R.raw.alphabet_aa);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp12.start();
            }
        });
//
        Button button13 = (Button) this.findViewById(R.id.button_13);
        final MediaPlayer mp13 = MediaPlayer.create(this, R.raw.alphabet_e);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp13.start();
            }
        });
//
        Button button21 = (Button) this.findViewById(R.id.button_21);
        final MediaPlayer mp21 = MediaPlayer.create(this, R.raw.alphabet_ee);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp21.start();
            }
        });
//
        Button button22 = (Button) this.findViewById(R.id.button_22);
        final MediaPlayer mp22 = MediaPlayer.create(this, R.raw.alphabet_u);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp22.start();
            }
        });
//
        Button button23 = (Button) this.findViewById(R.id.button_23);
        final MediaPlayer mp23 = MediaPlayer.create(this, R.raw.alphabet_uu);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp23.start();
            }
        });
//
        Button button31 = (Button) this.findViewById(R.id.button_31);
        final MediaPlayer mp31 = MediaPlayer.create(this, R.raw.alphabet_ruu);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp31.start();
            }
        });
//
        Button button32 = (Button) this.findViewById(R.id.button_32);
        final MediaPlayer mp32 = MediaPlayer.create(this, R.raw.alphabet_ruu);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp32.start();
            }
        });
//
//        Button button33 = (Button) this.findViewById(R.id.button_33);
//        final MediaPlayer mp33 = MediaPlayer.create(this, R.raw.alphabet_kaa);
//        button33.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp33.start();
//            }
//        });
//
//        Button button41 = (Button) this.findViewById(R.id.button_41);
//        final MediaPlayer mp41 = MediaPlayer.create(this, R.raw.alphabet_kha);
//        button41.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mp41.start();
//            }
//        });
//
        Button button42 = (Button) this.findViewById(R.id.button_42);
        final MediaPlayer mp42 = MediaPlayer.create(this, R.raw.alphabet_ye);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp42.start();
            }
        });
//
        Button button43 = (Button) this.findViewById(R.id.button_43);
        final MediaPlayer mp43 = MediaPlayer.create(this, R.raw.alphabet_yaye);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp43.start();
            }
        });
//
        Button button51 = (Button) this.findViewById(R.id.button_51);
        final MediaPlayer mp51 = MediaPlayer.create(this, R.raw.alphabet_o);
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp51.start();
            }
        });
//
        Button button52 = (Button) this.findViewById(R.id.button_52);
        final MediaPlayer mp52 = MediaPlayer.create(this, R.raw.alphabet_ouu);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp52.start();
            }
        });
//
        Button button53 = (Button) this.findViewById(R.id.button_53);
        final MediaPlayer mp53 = MediaPlayer.create(this, R.raw.alphabet_ka);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp53.start();
            }
        });

        Button button61 = (Button) this.findViewById(R.id.button_61);
        final MediaPlayer mp61 = MediaPlayer.create(this, R.raw.alphabet_kha);
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp61.start();
            }
        });

        Button button62 = (Button) this.findViewById(R.id.button_62);
        final MediaPlayer mp62 = MediaPlayer.create(this, R.raw.alphabet_ga);
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp62.start();
            }
        });

        Button button63 = (Button) this.findViewById(R.id.button_63);
        final MediaPlayer mp63 = MediaPlayer.create(this, R.raw.alphabet_gha);
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp63.start();
            }
        });

        Button button71 = (Button) this.findViewById(R.id.button_71);
        final MediaPlayer mp71 = MediaPlayer.create(this, R.raw.uooo);
        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp71.start();
            }
        });


        Button button72 = (Button) this.findViewById(R.id.button_72);
        final MediaPlayer mp72 = MediaPlayer.create(this, R.raw.chaa);
        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp72.start();
            }
        });

        Button button73 = (Button) this.findViewById(R.id.button_73);
        final MediaPlayer mp73 = MediaPlayer.create(this, R.raw.chaaa);
        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp73.start();
            }
        });

        Button button81 = (Button) this.findViewById(R.id.button_81);
        final MediaPlayer mp81 = MediaPlayer.create(this, R.raw.jaa);
        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp81.start();
            }
        });

        Button button82 = (Button) this.findViewById(R.id.button_82);
        final MediaPlayer mp82 = MediaPlayer.create(this, R.raw.jha);
        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp82.start();
            }
        });

        Button button83 = (Button) this.findViewById(R.id.button_83);
        final MediaPlayer mp83 = MediaPlayer.create(this, R.raw.niya);
        button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp83.start();
            }
        });

        Button button91 = (Button) this.findViewById(R.id.button_91);
        final MediaPlayer mp91 = MediaPlayer.create(this, R.raw.ta);
        button91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp91.start();
            }
        });

        Button button92 = (Button) this.findViewById(R.id.button_92);
        final MediaPlayer mp92 = MediaPlayer.create(this, R.raw.tha);
        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp92.start();
            }
        });

        Button button93 = (Button) this.findViewById(R.id.button_93);
        final MediaPlayer mp93 = MediaPlayer.create(this, R.raw.daa);
        button93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp93.start();
            }
        });

        Button button101 = (Button) this.findViewById(R.id.button_101);
        final MediaPlayer mp101 = MediaPlayer.create(this, R.raw.dhaaa);
        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp101.start();
            }
        });

        Button button102 = (Button) this.findViewById(R.id.button_102);
        final MediaPlayer mp102 = MediaPlayer.create(this, R.raw.nan);
        button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp102.start();
            }
        });

        Button button103 = (Button) this.findViewById(R.id.button_103);
        final MediaPlayer mp103 = MediaPlayer.create(this, R.raw.taa);
        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp103.start();
            }
        });

        Button button111 = (Button) this.findViewById(R.id.button_111);
        final MediaPlayer mp111 = MediaPlayer.create(this, R.raw.thatha);
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp111.start();
            }
        });

        Button button112 = (Button) this.findViewById(R.id.button_112);
        final MediaPlayer mp112 = MediaPlayer.create(this, R.raw.daaaa);
        button112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp112.start();
            }
        });

        Button button113 = (Button) this.findViewById(R.id.button_113);
        final MediaPlayer mp113 = MediaPlayer.create(this, R.raw.dhaaaa);
        button113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp113.start();
            }
        });

        Button button121 = (Button) this.findViewById(R.id.button_121);
        final MediaPlayer mp121 = MediaPlayer.create(this, R.raw.naa);
        button121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp121.start();
            }
        });

        Button button122 = (Button) this.findViewById(R.id.button_122);
        final MediaPlayer mp122 = MediaPlayer.create(this, R.raw.paa);
        button122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp122.start();
            }
        });

        Button button123 = (Button) this.findViewById(R.id.button_123);
        final MediaPlayer mp123 = MediaPlayer.create(this, R.raw.phaa);
        button123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp123.start();
            }
        });

        Button button131 = (Button) this.findViewById(R.id.button_131);
        final MediaPlayer mp131 = MediaPlayer.create(this, R.raw.baa);
        button131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp131.start();
            }
        });

        Button button132 = (Button) this.findViewById(R.id.button_132);
        final MediaPlayer mp132 = MediaPlayer.create(this, R.raw.bhaa);
        button132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp132.start();
            }
        });

        Button button133 = (Button) this.findViewById(R.id.button_133);
        final MediaPlayer mp133 = MediaPlayer.create(this, R.raw.maa);
        button133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp133.start();
            }
        });

        Button button141 = (Button) this.findViewById(R.id.button_141);
        final MediaPlayer mp141 = MediaPlayer.create(this, R.raw.jaa2);
        button141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp141.start();
            }
        });


        Button button142 = (Button) this.findViewById(R.id.button_142);
        final MediaPlayer mp142 = MediaPlayer.create(this, R.raw.eiya);
        button142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp142.start();
            }
        });

        Button button143 = (Button) this.findViewById(R.id.button_143);
        final MediaPlayer mp143 = MediaPlayer.create(this, R.raw.raa);
        button143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp143.start();
            }
        });

        Button button151 = (Button) this.findViewById(R.id.button_151);
        final MediaPlayer mp151 = MediaPlayer.create(this, R.raw.laaa);
        button151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp151.start();
            }
        });

        Button button152 = (Button) this.findViewById(R.id.button_152);
        final MediaPlayer mp152 = MediaPlayer.create(this, R.raw.alaaa);
        button152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp152.start();
            }
        });


        Button button161 = (Button) this.findViewById(R.id.button_161);
        final MediaPlayer mp161 = MediaPlayer.create(this, R.raw.saaa);
        button161.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp161.start();
            }
        });

        Button button162 = (Button) this.findViewById(R.id.button_162);
        final MediaPlayer mp162 = MediaPlayer.create(this, R.raw.saaa);
        button162.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp162.start();
            }
        });

        Button button163 = (Button) this.findViewById(R.id.button_163);
        final MediaPlayer mp163 = MediaPlayer.create(this, R.raw.saaa);
        button163.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp163.start();
            }
        });


        Button button171 = (Button) this.findViewById(R.id.button_171);
        final MediaPlayer mp171 = MediaPlayer.create(this, R.raw.haaa);
        button171.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp171.start();
            }
        });

    }
}