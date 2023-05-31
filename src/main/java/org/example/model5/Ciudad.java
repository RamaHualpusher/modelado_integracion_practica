package org.example.model5;
import lombok.Data;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Ciudad {
    private List<Restaurante> restaurantes;

    public List<Restaurante> obtenerRestaurantesConPlato(Plato plato) {
        return restaurantes.stream()
                .filter(restaurante -> restaurante.getPlatos().contains(plato))
                .collect(Collectors.toList());
    }
}
