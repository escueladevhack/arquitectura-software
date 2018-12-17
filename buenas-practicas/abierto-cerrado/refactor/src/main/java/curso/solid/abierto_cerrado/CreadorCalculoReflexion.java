package curso.solid.abierto_cerrado;

import java.lang.reflect.InvocationTargetException;

public class CreadorCalculoReflexion {

    public CalculoEnvio obtenerInstancia(Pais data){

        CalculoEnvio result = null;

        String nombreClase = "curso.solid.abierto_cerrado.envio.CalculoEnvio" + data.name();
        try {
            Class clase = Class.forName(nombreClase);
            Object objeto = clase.getDeclaredConstructor().newInstance();
            result = (CalculoEnvio) objeto;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

         return result;
    }

}
