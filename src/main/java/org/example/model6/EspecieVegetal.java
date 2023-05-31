package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class EspecieVegetal extends Especie {
    private boolean floracion;
    private String periodoFlorecimiento;
}
