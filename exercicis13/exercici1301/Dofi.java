package com.exercici1301;

class Dofi extends Mamifer implements Nedador {

    public Dofi(String nom, int edat, String tipusPelatge) {
        super(nom, edat, tipusPelatge);
    }

    @Override
    public String nedar(){
        return nom + " Esta Nedant!";
    }
}
