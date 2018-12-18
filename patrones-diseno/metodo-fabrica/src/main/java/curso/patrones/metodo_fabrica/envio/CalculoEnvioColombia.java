package curso.patrones.metodo_fabrica.envio;

import curso.patrones.metodo_fabrica.CalculoEnvio;
import curso.patrones.metodo_fabrica.Orden;

public class CalculoEnvioColombia implements CalculoEnvio {

    private double pesoMinimo;
    private int multiplicadorPeso;
    private double excedente;
    private double porcentajeInicial;

    public double calcular(Orden orden){

        double resultado = orden.getTotal() * porcentajeInicial;
        if (orden.getPeso() <= pesoMinimo)
        {
            resultado += excedente;
        }
        else {
            resultado += orden.getPeso() * multiplicadorPeso;
        }

        return resultado;
    }

    public void setPesoMinimo(double pesoMinimo) {
        this.pesoMinimo = pesoMinimo;
    }

    public void setMultiplicadorPeso(int multiplicadorPeso) {
        this.multiplicadorPeso = multiplicadorPeso;
    }

    public void setExcedente(double excedente) {
        this.excedente = excedente;
    }

    public void setPorcentajeInicial(double porcentajeInicial) {
        this.porcentajeInicial = porcentajeInicial;
    }
}
