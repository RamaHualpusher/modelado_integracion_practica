package org.example.model5;
import lombok.Data;
import java.util.List;

@Data
public class Restaurante {
    private String nombre;
    private List<Sucursal> sucursales;
    private List<Plato> platos;
}
