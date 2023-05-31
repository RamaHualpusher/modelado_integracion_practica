package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class ParqueNacional {
    private String nombre;
    private LocalDate fechaDeclaracion;
    private List<Area> areas;
    private List<Alojamiento> alojamientos;
    private List<Entrada> entradas;
    private List<Personal> personal;
}
