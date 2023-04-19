package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getWindow().getDecorView().setBackgroundColor(Color.RED);

        ArrayList<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("01/10/2021", "01/09/2023", "Delicorner", "Développeur full stack"));

        ListView listViewExperiences = findViewById(R.id.listViewExperiences);
        ExperienceBaseAdapter adapter = new ExperienceBaseAdapter(experiences, this);
        listViewExperiences.setAdapter(adapter);


        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("19/07/2023", "CDA", "CFA INSTA"));
        formations.add(new Formation("20/06/2022", "BTS SIO", "CFA INSTA"));
        formations.add(new Formation("05/07/2020", "BAC STI2D", "Paris 19"));

        ListView listViewFormations = findViewById(R.id.listViewFormations);
        FormationBaseAdapter adapterf = new FormationBaseAdapter(formations, this);
        listViewFormations.setAdapter(adapterf);

        Button button = findViewById(R.id.buttonCompetence);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, CompetenceActivity.class);
        startActivity(intent);
    }
}