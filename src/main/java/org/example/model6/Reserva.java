package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class Reserva {
    private Visitante visitante;
    private Habitacion habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}
