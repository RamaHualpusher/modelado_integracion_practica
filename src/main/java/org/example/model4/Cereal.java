package org.example.model4;
import lombok.Data;
import java.util.List;
@Data
public abstract class Cereal {
    private String nombre;
    private List<Mineral> mineralesRequeridos;

    public abstract boolean cumpleRequerimientos(Lote lote);
}
