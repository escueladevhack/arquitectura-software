package curso.patrones.metodo_fabrica;

import curso.patrones.metodo_fabrica.fabrica.CreadorEnvioColombia;
import curso.patrones.metodo_fabrica.fabrica.CreadorEnvioMexico;
import curso.patrones.metodo_fabrica.fabrica.CreadorEnvioPeru;

import java.util.HashMap;
import java.util.Map;

public class GeneradorCreadorEnvio {

    private static GeneradorCreadorEnvio instancia;

    private Map<Pais, CreadorEnvio> mapeoCreadores;

    private GeneradorCreadorEnvio() {
        mapeoCreadores = new HashMap<Pais, CreadorEnvio>();
        mapeoCreadores.put(Pais.Colombia, new CreadorEnvioColombia());
        mapeoCreadores.put(Pais.Mexico, new CreadorEnvioMexico());
        mapeoCreadores.put(Pais.Peru, new CreadorEnvioPeru());
    }

    public static GeneradorCreadorEnvio obtenerInstancia() {
        if(instancia == null) {
            instancia = new GeneradorCreadorEnvio();
        }
        return instancia;
    }

    public CreadorEnvio obtenerCreadorEnvio(Pais pais) {

        CreadorEnvio creador = null;
        if(mapeoCreadores.containsKey(pais)) {
            creador = mapeoCreadores.get(pais);
        }
        return creador;
    }

}
