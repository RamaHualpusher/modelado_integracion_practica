package org.example.model7;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;
@Data
public abstract class Participante {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int edad;
    private FederacionEsqui federacion;
}
