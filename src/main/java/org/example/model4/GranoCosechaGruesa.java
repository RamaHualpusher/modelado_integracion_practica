package org.example.model4;
import lombok.Data;
import java.util.List;
@Data
public class GranoCosechaGruesa extends Cereal {
    @Override
    public boolean cumpleRequerimientos(Lote lote) {
        // Implementación de la verificación de requerimientos para granos de cosecha gruesa
        return lote.getMinerales().containsAll(this.getMineralesRequeridos());
    }
}
