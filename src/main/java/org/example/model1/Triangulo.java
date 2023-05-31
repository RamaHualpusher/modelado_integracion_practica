package org.example.model1;

import lombok.Data;

@Data
public class Triangulo extends Poligono {
    public Triangulo(Punto puntoA, Punto puntoB, Punto puntoC) {
        this.vertices = new Punto[]{puntoA, puntoB, puntoC};
    }

    @Override
    public double calcularArea() {
        // Implementación del cálculo del área del triángulo
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        // Implementación del cálculo del perímetro del triángulo
        return 0;
    }
}
