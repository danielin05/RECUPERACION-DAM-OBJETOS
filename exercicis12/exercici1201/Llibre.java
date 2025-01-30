package com.exemple1201;

public class Llibre {
    
    private String titol, autor;
    private int anyPublicacio;
    private boolean prestec;

    public Llibre(String titol, String autor, int anyPublicacio) {
        this.titol = titol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
        this.prestec = false;
    }

    public String getTitol() {
        return titol;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnyPublicacio() {
        return anyPublicacio;
    }
    public void setAnyPublicacio(int anyPublicacio) {
        this.anyPublicacio = anyPublicacio;
    }
    public boolean estaPrestat() {
        return prestec;
    }

    public void prestar() {
        this.prestec = true;
    }

    public void retornar() {
        this.prestec = false;
    }
    
    @Override
    public String toString() {
        return "Titol: " + this.titol  + ", Autor: " + this.autor + ", Any: " + this.anyPublicacio + ", Prestec: " + this.prestec;
    }

}
