package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class Area {
    private String nombre;
    private double km2;
    private List<Especie> especiesResidentes;
    private List<Guarda> guardas;
    private List<ParqueNacional> parquesNacionales;
}
