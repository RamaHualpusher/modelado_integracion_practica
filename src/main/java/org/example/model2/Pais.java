package org.example.model2;
import lombok.Data;
import java.util.List;
@Data
public class Pais {
    private String nombre;
    private List<Provincia> provincias;
    private Ciudad capital;
    private List<Pais> paisesLimite;
    private Continente continente;
}
