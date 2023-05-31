package org.example.model4;
import lombok.Data;
import java.util.List;
@Data
public class GranoCosechaFina extends Cereal {
    @Override
    public boolean cumpleRequerimientos(Lote lote) {
        // Implementación de la verificación de requerimientos para granos de cosecha fina
        return lote.getMinerales().containsAll(this.getMineralesRequeridos());
    }
}
