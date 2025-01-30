package com.exercici1203;

import java.util.List;

public class RegistreaccionsSingleton {

    private static RegistreaccionsSingleton instance;
    public List accions;
 
    public static RegistreaccionsSingleton getInstance() {
        return instance;
    }

    public void registrarAccio(String accio){
        accions.add(accio);
    }

    public void mostrarAccions(){
        for (String a : accions){
            System.out.println(a);
        }
    }
}
