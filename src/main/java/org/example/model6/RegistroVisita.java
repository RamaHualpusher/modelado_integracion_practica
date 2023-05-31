package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public class RegistroVisita {
    private Visitante visitante;
    private LocalDate fechaVisita;
}
