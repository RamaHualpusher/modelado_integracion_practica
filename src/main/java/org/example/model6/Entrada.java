package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class Entrada {
    private int numero;
    private ParqueNacional parqueNacional;
    private List<Celador> celadores;
}
