package curso.patrones.metodo_fabrica.fabrica;

import curso.patrones.metodo_fabrica.CalculoEnvio;
import curso.patrones.metodo_fabrica.CreadorEnvio;
import curso.patrones.metodo_fabrica.envio.CalculoEnvioPeru;

public class CreadorEnvioPeru extends CreadorEnvio {

    public CalculoEnvio fabricar() {
        CalculoEnvioPeru envio = new CalculoEnvioPeru();
        envio.setPorcentaje(0.1);
        return envio;
    }

}
