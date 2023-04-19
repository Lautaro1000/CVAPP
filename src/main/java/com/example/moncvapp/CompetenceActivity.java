package com.example.moncvapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CompetenceActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competences);

        ArrayList<Competence> competences = new ArrayList<Competence>();
        competences.add(new Competence("PHP", 4));
        competences.add(new Competence("JAVA", 4));
        competences.add(new Competence("SQL", 4));
        competences.add(new Competence("JS", 3));

        ListView listViewCompetences = findViewById(R.id.listViewCompetences);
        CompetenceBaseAdapter adapterc = new CompetenceBaseAdapter(competences, this);
        listViewCompetences.setAdapter(adapterc);


        ArrayList<Projet> projets = new ArrayList<Projet>();
        projets.add(new Projet("Projet Bac", "systeme de sécurité de la BNF(Arduino)", "https://gitlab.com/-/profile"));
        projets.add(new Projet("Création d'un site web", "Création d'une plateforme de Sondage", "https://gitlab.com/-/profile"));
        projets.add(new Projet("Création d'un site de pharmacie", "Création d'une plateforme de gestion de pharmacie", "https://gitlab.com/-/profile"));

        ListView listViewProjets = findViewById(R.id.listViewProjets);
        ProjetBaseAdapter adapterp = new ProjetBaseAdapter(projets, this);
        listViewProjets.setAdapter(adapterp);

        Button button = findViewById(R.id.buttonExperiences);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(CompetenceActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
