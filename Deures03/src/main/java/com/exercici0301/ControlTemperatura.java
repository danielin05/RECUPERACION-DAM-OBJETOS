package com.exercici0301;

public class ControlTemperatura {

    private String nomZona;
    private double temperatura;

    private static int zones = 0; 
    private static double temperaturaTotal = 0.0;

    public ControlTemperatura(String nomZona, double temperatura) {
        this.nomZona = nomZona;
        this.temperatura = temperatura;
        zones++;
        temperaturaTotal += temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String getNomZona() {
        return nomZona;
    }

    public void ajustaTemperatura(double novaTemperatura) {
        temperaturaTotal -= this.temperatura;
        this.temperatura = novaTemperatura;
        temperaturaTotal += novaTemperatura;
    }

    public static double getTemperaturaMitjana() {
        if(zones == 0){
            return 0.0;
        } else{
            return temperaturaTotal/zones;
        }
    }
}

