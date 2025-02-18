package com.exercici0300;

public class Estudiant {
    
    private String nom, id;

    private static int cnt = 0;
    private static int MAX_STDNT = 5;

    // Constructor
    public Estudiant(String nom, String id) {
        if (cnt < MAX_STDNT){
            this.id = id;
            this.nom = nom;
            cnt++;
        } else{
            System.out.println("ERROR: No es pot afegir cap estudiant mes. Limit de capacitat alcansat.");
        }
    }

    

    public String getNom() {
        return nom;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }



    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }



    // Mètodes públics estàtics
    public static int getComptadorEstudiants() {
        return cnt;
    }

    public static boolean hiHaCapacitat() {
        if(cnt < MAX_STDNT){
            return true;
        } else{
            return false;
        }
    }
}
