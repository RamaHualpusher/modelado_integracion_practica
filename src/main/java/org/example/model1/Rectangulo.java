package org.example.model1;

import lombok.Data;

@Data
public class Rectangulo extends Poligono {

    public Rectangulo() {
        this.vertices = new Punto[4];
    }
    public Rectangulo(Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD) {
        this.vertices = new Punto[]{puntoA, puntoB, puntoC, puntoD};
    }

    @Override
    public double calcularArea() {
        // Implementación del cálculo del área del rectángulo
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        // Implementación del cálculo del perímetro del rectángulo
        return 0;
    }
}
