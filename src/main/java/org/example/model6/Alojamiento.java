package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class Alojamiento {
    private String nombre;
    private int capacidad;
    private String categoria;
    private List<Reserva> reservas;
    private List<Excursion> excursiones;
    private ParqueNacional parqueNacional;
}
