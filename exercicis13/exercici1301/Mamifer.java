package com.exercici1301;

public class Mamifer extends Animal {
    private String tipusPelatge;

    public Mamifer(String nom, int edat, String tipusPelatge) {
        super(nom, edat);
        this.tipusPelatge = tipusPelatge;
    }

    @Override
    public String toString(){
        return super.toString() + ", " + this.tipusPelatge;
    }

}
