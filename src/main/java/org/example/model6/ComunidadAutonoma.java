package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class ComunidadAutonoma {
    private String nombre;
    private List<ParqueNacional> parques;
    private OrganismoResponsable organismoResponsable;
}
