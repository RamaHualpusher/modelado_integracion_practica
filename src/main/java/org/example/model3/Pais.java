package org.example.model3;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Pais {
    private String nombre;
    private List<Provincia> provincias;
    private Ciudad capital;
    private List<Pais> paisesLimite;
    private Continente continente;

    public List<Ciudad> getCiudadesConDeficit() {
        return provincias.stream()
                .flatMap(provincia -> provincia.getCiudadesConDeficit().stream())
                .collect(Collectors.toList());
    }

    public List<Provincia> getProvinciasConDeficitMayorAMitad() {
        return provincias.stream()
                .filter(Provincia::tieneMasDeLaMitadDeCiudadesConDeficit)
                .collect(Collectors.toList());
    }
}
