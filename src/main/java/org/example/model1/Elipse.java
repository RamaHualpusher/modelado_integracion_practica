package org.example.model1;

import lombok.Data;

@Data
public class Elipse extends Figura {
    private Punto centro;
    private double radioMayor;
    private double radioMenor;

    @Override
    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * Math.sqrt((Math.pow(radioMayor, 2) + Math.pow(radioMenor, 2)) / 2);
    }
}
