package org.example.model7;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;
@Data
public class Equipo extends Participante {
    private String codigo;
    private String entrenador;
    private List<Esquiador> esquiadores;
}
