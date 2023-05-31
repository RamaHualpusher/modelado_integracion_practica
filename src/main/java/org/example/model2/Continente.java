package org.example.model2;
import lombok.Data;
import java.util.List;
@Data
public class Continente {
    private String nombre;
    private List<Pais> paises;
}
