package org.example.model7;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;
@Data
public class CampeonatoEsqui {
    private List<Prueba> pruebas;
    private List<FederacionEsqui> federaciones;
}
