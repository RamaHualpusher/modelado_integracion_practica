package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class Celador extends Personal {
    private Entrada entradaDestinada;
    private List<RegistroVisita> registros;
}
