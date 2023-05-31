package org.example.model3;
import lombok.Data;

@Data
public class Ciudad {
    private String nombre;
    private double montoRecaudadoImp1;
    private double montoRecaudadoImp2;
    private double montoRecaudadoImp3;
    private double montoRecaudadoImp4;
    private double montoRecaudadoImp5;
    private double gastoMantenimiento;

    public boolean tieneDeficit() {
        double totalRecaudado = montoRecaudadoImp1 + montoRecaudadoImp2 + montoRecaudadoImp3 +
                montoRecaudadoImp4 + montoRecaudadoImp5;
        return totalRecaudado < gastoMantenimiento;
    }
}
