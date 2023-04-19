package com.example.moncvapp;

public class Projet {
    public String nom;
    public String description;
    public String git;

    public Projet(String nom, String description, String git) {
        this.nom = nom;
        this.description = description;
        this.git = git;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGit() {
        return git;
    }

    public void setGit(String git) {
        this.git = git;
    }
}
