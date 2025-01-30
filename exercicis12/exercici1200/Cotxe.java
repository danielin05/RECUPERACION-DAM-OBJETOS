package com.exemple1200;

public class Cotxe {
    
    private String color, marca, model;
    private int cilindrada, any;

    public Cotxe(String color, String marca, String model, int cilindrada, int any) {
        this.color = color;
        this.marca = marca;
        this.model = model;
        this.cilindrada = cilindrada;
        this.any = any;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public int getAny() {
        return any;
    }
    public void setAny(int any) {
        this.any = any;
    }

    @Override
    public String toString() {
        return "Cotxe [color = " + color + ", marca = " + marca + ", model = " + model + ", cilindrada = " + cilindrada + ", any = " + any + "]";
    }

    

}
