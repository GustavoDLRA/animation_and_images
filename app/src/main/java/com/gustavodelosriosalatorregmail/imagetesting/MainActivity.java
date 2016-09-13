package com.gustavodelosriosalatorregmail.imagetesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void movehaxorus(View view){
        ImageView entei=(ImageView) findViewById(R.id.entei);
        ImageView haxorus=(ImageView)findViewById(R.id.haxorus);
        Button pokebola1=(Button) findViewById(R.id.pokebola1);
        Button pokebola2=(Button) findViewById(R.id.pokebola2);

        entei.animate().translationXBy(1000f).setDuration(2000);
        entei.animate().alpha(0f);
        haxorus.animate().translationYBy(3000f).setDuration(2000);

        pokebola1.setEnabled(false);
        pokebola1.setVisibility(View.INVISIBLE);

        pokebola2.setEnabled(true);
        pokebola2.setVisibility(View.VISIBLE);

    }
    public void fade(View view){
        ImageView togepi=(ImageView) findViewById(R.id.togepi);
        ImageView haxorus=(ImageView) findViewById(R.id.haxorus);
        Button pokebola2=(Button) findViewById(R.id.pokebola2);
        Button pokebola_reinicio=(Button) findViewById(R.id.pokebola_reinicio);

        haxorus.animate().alpha(0f).setDuration(2000);
        togepi.animate().alpha(1f).setDuration(2000);

        pokebola2.setEnabled(false);
        pokebola2.setVisibility(View.INVISIBLE);

        pokebola_reinicio.setEnabled(true);
        pokebola_reinicio.setVisibility(View.VISIBLE);
    }

    public void resetImages(View view){
        Button pokebola1=(Button) findViewById(R.id.pokebola1);
        Button pokebola_reinicio=(Button) findViewById(R.id.pokebola_reinicio);
        ImageView entei=(ImageView) findViewById(R.id.entei);
        ImageView haxorus=(ImageView) findViewById(R.id.haxorus);
        ImageView togepi=(ImageView) findViewById(R.id.togepi);

        haxorus.setVisibility(View.INVISIBLE);
        haxorus.setTranslationY(-3000);
        togepi.setAlpha(0f);
        togepi.animate().translationX(0f).setDuration(0);
        entei.setAlpha(1f);
        entei.animate().translationX(0f).setDuration(0);

        pokebola_reinicio.setEnabled(false);
        pokebola_reinicio.setVisibility(View.INVISIBLE);

        pokebola1.setEnabled(true);
        pokebola1.setVisibility(View.VISIBLE);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView haxorus=(ImageView) findViewById(R.id.haxorus);
        haxorus.setTranslationY(-3000);

    }
}
