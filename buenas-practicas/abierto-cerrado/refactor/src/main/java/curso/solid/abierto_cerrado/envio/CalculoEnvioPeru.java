package curso.solid.abierto_cerrado.envio;

import curso.solid.abierto_cerrado.CalculoEnvio;
import curso.solid.abierto_cerrado.Orden;

public class CalculoEnvioPeru implements CalculoEnvio {


    public double calcular(Orden orden) {
        double calculo = orden.getTotal() * 0.10;
        return calculo;
    }
}
