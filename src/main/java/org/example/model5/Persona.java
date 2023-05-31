package org.example.model5;
import lombok.Data;
import java.util.List;

@Data
public class Persona {
    private String nombre;
    private List<Plato> platosGustados;
    private List<Restaurante> restaurantesFrecuentados;

    public boolean leGustaPlatoEnAlgunRestaurante(Plato plato) {
        return restaurantesFrecuentados.stream()
                .anyMatch(restaurante -> restaurante.getPlatos().contains(plato));
    }
}
