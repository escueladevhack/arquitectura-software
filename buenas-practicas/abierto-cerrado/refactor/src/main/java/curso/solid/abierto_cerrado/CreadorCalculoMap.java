package curso.solid.abierto_cerrado;

import curso.solid.abierto_cerrado.envio.*;

import java.util.HashMap;

public class CreadorCalculoMap {

    private HashMap<Pais, CalculoEnvio> mapeo;

    public CreadorCalculoMap(){

        mapeo = new HashMap<Pais, CalculoEnvio>();
        mapeo.put(Pais.Colombia, new CalculoEnvioColombia());
        mapeo.put(Pais.Mexico, new CalculoEnvioMexico());
        mapeo.put(Pais.Peru, new CalculoEnvioPeru());

    }

    public CalculoEnvio obtenerInstancia(Pais data){

        CalculoEnvio result = null;
        if(mapeo.containsKey(data)){
            result = mapeo.get(data);
        }
         return result;

    }

}
