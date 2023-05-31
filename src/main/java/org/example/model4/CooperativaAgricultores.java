package org.example.model4;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CooperativaAgricultores {
    private List<Lote> lotes;

    public List<Cereal> asesorarSiembra(Lote lote) {
        return getCerealesDisponibles().stream()
                .filter(cereal -> cereal.cumpleRequerimientos(lote))
                .collect(Collectors.toList());
    }

    private List<Cereal> getCerealesDisponibles() {
        // Los cereales disponibles podrían ser obtenidos desde una base de datos, un archivo, etc.
        return List.of(new GranoCosechaGruesa(), new GranoCosechaFina(), new Pastura());
    }
}
