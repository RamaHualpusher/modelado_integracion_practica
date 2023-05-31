package org.example.model7;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;
@Data
public class FederacionEsqui {
    private String nombre;
    private int numeroFederados;
    private List<Participante> participantes;
    private List<EstacionEsqui> estaciones;
}
