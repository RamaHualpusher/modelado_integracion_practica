package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class ProyectoInvestigacion {
    private String nombre;
    private double presupuesto;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<Especie> especiesInvestigadas;
    private List<Investigador> investigadores;
}
