package curso.patrones.metodo_fabrica.fabrica;

import curso.patrones.metodo_fabrica.CalculoEnvio;
import curso.patrones.metodo_fabrica.CreadorEnvio;
import curso.patrones.metodo_fabrica.envio.CalculoEnvioColombia;

public class CreadorEnvioColombia extends CreadorEnvio {

    public CalculoEnvio fabricar() {

        CalculoEnvioColombia calculoEnvio = new CalculoEnvioColombia();
        calculoEnvio.setExcedente(3500);
        calculoEnvio.setMultiplicadorPeso(1500);
        calculoEnvio.setPesoMinimo(2);
        calculoEnvio.setPorcentajeInicial(0.01);

        return calculoEnvio;
    }

}
