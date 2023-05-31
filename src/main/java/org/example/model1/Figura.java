package org.example.model1;

import lombok.Data;

@Data
public abstract class Figura {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
