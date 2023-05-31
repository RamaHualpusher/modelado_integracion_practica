package org.example.model7;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;
@Data
public class Prueba {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private TipoPrueba tipo;
    private List<Participacion> participaciones;
    private Participacion vencedor;
}
