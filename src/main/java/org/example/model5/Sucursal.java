package org.example.model5;
import lombok.Data;
import java.util.List;

@Data
public class Sucursal {
    private String direccion;
    private Restaurante restaurante; // Cada sucursal pertenece a un restaurante.
}
