package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class Excursion {
    private String codigo;
    private LocalDate dia;
    private String hora;
    private List<Visitante> visitantesInscritos;
}
