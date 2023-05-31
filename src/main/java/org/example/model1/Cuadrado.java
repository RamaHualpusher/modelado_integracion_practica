package org.example.model1;

import lombok.Data;

@Data
public class Cuadrado extends Rectangulo {
    private double lado;



    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
