package org.example.model7;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;
@Data
public class Pista {
    private String codigoEstacion;
    private int numero;
    private double longitud;
    private NivelDificultad nivelDificultad;
}
