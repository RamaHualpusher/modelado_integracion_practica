package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class Investigador extends Personal {
    private String titulacion;
    private List<ProyectoInvestigacion> proyectosIntervenidos;
}
