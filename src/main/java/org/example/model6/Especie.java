package org.example.model6;
import lombok.Data;
import java.util.List;
import java.time.LocalDate;

@Data
public abstract class Especie {
    private String nombreCientifico;
    private String nombreVulgar;
    private int numeroIndividuosArea;
    private List<Area> areas;
}
