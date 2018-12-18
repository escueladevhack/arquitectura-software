package curso.patrones.metodo_fabrica.fabrica;

import curso.patrones.metodo_fabrica.CalculoEnvio;
import curso.patrones.metodo_fabrica.CreadorEnvio;
import curso.patrones.metodo_fabrica.envio.CalculoEnvioMexico;

public class CreadorEnvioMexico extends CreadorEnvio {

    public CalculoEnvio fabricar() {
        return new CalculoEnvioMexico(98);
    }

}
