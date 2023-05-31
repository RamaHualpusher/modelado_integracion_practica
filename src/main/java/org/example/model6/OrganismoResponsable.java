package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class OrganismoResponsable {
    private String nombre;
    private List<ComunidadAutonoma> comunidadesAutonomas;
}
