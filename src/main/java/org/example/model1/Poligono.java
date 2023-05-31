package org.example.model1;

import lombok.Data;

@Data
public abstract class Poligono extends Figura {
    protected Punto[] vertices;
}
