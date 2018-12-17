package curso.solid.abierto_cerrado.envio;

import curso.solid.abierto_cerrado.CalculoEnvio;
import curso.solid.abierto_cerrado.Orden;

public class CalculoEnvioMexico implements CalculoEnvio {


    public double calcular(Orden orden){
        return 98;
    }
}
