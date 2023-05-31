package org.example.model7;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;
@Data
public class EstacionEsqui {
    private String codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private int kilometrosEsquiables;
    private List<Pista> pistas;
}
