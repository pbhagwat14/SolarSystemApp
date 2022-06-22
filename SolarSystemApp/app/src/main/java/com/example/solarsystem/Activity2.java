package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent caller = getIntent();
        int pos = caller.getIntExtra("PlanetPos",0);
        String toasttext = "Planet " + pos;
        Toast.makeText(getApplicationContext(),toasttext,Toast.LENGTH_SHORT).show();

        WebView wikiView =  findViewById(R.id.wikiview);
        ImageView planetImage = findViewById(R.id.imagePlanet);
        //planetImage.setImageResource(R.drawable.test);

        wikiView.setWebViewClient(new WebViewClient());



        switch(pos) {
            case 1:
            wikiView.loadUrl(getString(R.string.webP1));
            planetImage.setImageResource(R.drawable.mercury);
            break;
            case 2:
            wikiView.loadUrl(getString(R.string.webP2));
            planetImage.setImageResource(R.drawable.venus);
            break;
            case 3:
            wikiView.loadUrl(getString(R.string.webP3));
            planetImage.setImageResource(R.drawable.earth);
            break;
            case 4:
            wikiView.loadUrl(getString(R.string.webP4));
            planetImage.setImageResource(R.drawable.mars);
            break;
            case 5:
            wikiView.loadUrl(getString(R.string.webP5));
            planetImage.setImageResource(R.drawable.jupiter);
            break;
            case 6:
            wikiView.loadUrl(getString(R.string.webP6));
            planetImage.setImageResource(R.drawable.saturn);
            break;
            case 7:
            wikiView.loadUrl(getString(R.string.webP7));
            planetImage.setImageResource(R.drawable.uranus);
            break;
            case 8:
            wikiView.loadUrl(getString(R.string.webP8));
            planetImage.setImageResource(R.drawable.neptune);
            break;

        }




    }
}