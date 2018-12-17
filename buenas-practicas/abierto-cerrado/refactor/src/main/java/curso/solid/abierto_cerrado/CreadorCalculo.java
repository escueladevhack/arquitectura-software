package curso.solid.abierto_cerrado;

import curso.solid.abierto_cerrado.envio.*;

public class CreadorCalculo {

    public CalculoEnvio obtenerInstancia(Pais data){

        CalculoEnvio result = null;

         switch (data){

             case Colombia : result = new CalculoEnvioColombia(); break;
             case Mexico   : result = new CalculoEnvioMexico(); break;
             case Peru     : result = new CalculoEnvioPeru(); break;
             default: return null;

         }

         return result;

    }

}
