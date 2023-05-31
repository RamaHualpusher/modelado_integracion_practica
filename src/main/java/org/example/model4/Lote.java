package org.example.model4;
import lombok.Data;
import java.util.List;
@Data
public class Lote {
    private String nombre;
    private boolean esEspecial;
    private List<Mineral> minerales;
    private Cereal cerealSembrado;
}
