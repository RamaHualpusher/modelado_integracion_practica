package org.example.model7;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;
@Data
public class Participacion {
    private Participante participante;
    private Prueba prueba;
    private LocalDate fechaCompetencia;
    private double tiempo;
    private int posicion;
}
