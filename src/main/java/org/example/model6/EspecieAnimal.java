package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class EspecieAnimal extends Especie {
    private String periodoCelo;
    private Alimentacion alimentacion;
    private List<Especie> especiesAlimento;
}
