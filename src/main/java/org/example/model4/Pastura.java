package org.example.model4;
import lombok.Data;
import java.util.List;
@Data
public class Pastura extends Cereal {
    @Override
    public boolean cumpleRequerimientos(Lote lote) {
        // Implementación de la verificación de requerimientos para pasturas
        if (lote.getCerealSembrado() instanceof Pastura) {
            return false;
        }
        return lote.getMinerales().containsAll(this.getMineralesRequeridos());
    }
}
