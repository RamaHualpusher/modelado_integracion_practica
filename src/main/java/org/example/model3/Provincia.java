package org.example.model3;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Provincia {
    private String nombre;
    private List<Provincia> provinciasLimite;
    private List<Pais> paisesLimite;
    private List<Ciudad> ciudades;

    public List<Ciudad> getCiudadesConDeficit() {
        return ciudades.stream()
                .filter(Ciudad::tieneDeficit)
                .collect(Collectors.toList());
    }

    public boolean tieneMasDeLaMitadDeCiudadesConDeficit() {
        long contadorCiudadesConDeficit = ciudades.stream().filter(Ciudad::tieneDeficit).count();
        return contadorCiudadesConDeficit > ciudades.size() / 2;
    }
}
