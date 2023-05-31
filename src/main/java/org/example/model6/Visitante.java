package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class Visitante {
    private String dni;
    private String nombre;
    private String direccion;
    private String profesion;
    private List<Excursion> excursionesInscritas;
    private Alojamiento alojamientoActual;
}
