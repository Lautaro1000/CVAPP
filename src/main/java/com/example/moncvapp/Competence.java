package com.example.moncvapp;

public class Competence {
    public String langage;
    public int niveau;

    public Competence(String langage, int niveau) {
        this.langage = langage;
        this.niveau = niveau;
    }

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}
