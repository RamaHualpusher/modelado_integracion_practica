package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class Guarda extends Personal {
    private List<Area> areasAsignadas;
    private Vehiculo vehiculo;
}
