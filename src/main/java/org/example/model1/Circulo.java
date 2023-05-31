package org.example.model1;

import lombok.Data;

@Data
public class Circulo extends Figura {
    private Punto centro;
    private double radio;

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
