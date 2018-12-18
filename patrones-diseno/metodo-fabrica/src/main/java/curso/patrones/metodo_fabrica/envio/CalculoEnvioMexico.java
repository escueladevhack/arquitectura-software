package curso.patrones.metodo_fabrica.envio;

import curso.patrones.metodo_fabrica.CalculoEnvio;
import curso.patrones.metodo_fabrica.Orden;

public class CalculoEnvioMexico implements CalculoEnvio {

    private double valorConstante;

    public CalculoEnvioMexico(double valorConstante){
        this.valorConstante = valorConstante;
    }


    public double calcular(Orden orden){
        return 98;
    }
}
