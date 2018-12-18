package curso.patrones.metodo_fabrica.envio;

import curso.patrones.metodo_fabrica.CalculoEnvio;
import curso.patrones.metodo_fabrica.Orden;

public class CalculoEnvioPeru implements CalculoEnvio {

    private double porcentaje;

    public double calcular(Orden orden) {
        double calculo = orden.getTotal() * porcentaje;
        return calculo;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
