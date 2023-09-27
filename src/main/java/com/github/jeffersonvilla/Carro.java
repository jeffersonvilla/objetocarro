package com.github.jeffersonvilla;

import java.io.Serializable;

public class Carro implements Serializable{

    private static final Long SerialVersionUID = 1L;

    private String marca;
    private String color;
    
    public Carro(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static Long getSerialversionuid() {
        return SerialVersionUID;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", color=" + color + "]";
    }   
    
}
