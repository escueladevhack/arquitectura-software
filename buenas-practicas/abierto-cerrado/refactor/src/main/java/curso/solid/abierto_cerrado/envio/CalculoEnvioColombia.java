package curso.solid.abierto_cerrado.envio;

import curso.solid.abierto_cerrado.CalculoEnvio;
import curso.solid.abierto_cerrado.Orden;

public class CalculoEnvioColombia implements CalculoEnvio {

    public double calcular(Orden orden){


        double resultado = orden.getTotal() * 0.01;
        if (orden.getPeso() <= 2)
        {
            resultado += 3500;
        }
        else {
            resultado += orden.getPeso() * 1500;
        }

        return resultado;
    }

}
