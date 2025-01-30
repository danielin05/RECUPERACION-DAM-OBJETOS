package com.exercici1301;

public abstract class Animal {
    protected String nom;
    protected int edat;
    
    public Animal(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "nom = " + nom + ", edat = " + edat;
    }
    
}
