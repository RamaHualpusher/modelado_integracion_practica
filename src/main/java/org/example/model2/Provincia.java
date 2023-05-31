package org.example.model2;
import lombok.Data;
import java.util.List;
@Data
public class Provincia {
    private String nombre;
    private List<Provincia> provinciasLimite;
    private List<Pais> paisesLimite;
    private List<Ciudad> ciudades;
    private Ciudad capital;
}
