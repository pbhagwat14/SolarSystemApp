package com.example.solarsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void StartAct(int pos){
        Intent gotosecond = new Intent();
        gotosecond.setClass(this,Activity2.class);
        gotosecond.putExtra("PlanetPos",pos);
        startActivity(gotosecond);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView planetList = (ListView) findViewById(R.id.ListView);
        final ArrayAdapter<CharSequence> adapterPlanet = ArrayAdapter.createFromResource(this,
                                                                            R.array.planetsArray,
                                                            android.R.layout.simple_list_item_1);
        planetList.setAdapter(adapterPlanet);

        planetList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                StartAct(position+1);

            }
        });
    }
}