package curso.patrones.observador;

import curso.patrones.observador.entidades.Usuario;
import curso.patrones.observador.negocio.ServicioUsuario;

public class Application {

    public static void main(String[] args) {

        ServicioUsuario servicio = new ServicioUsuario();

        //Crear observador y registrarlo en el servicio


        Usuario usuario = new Usuario("Jack", "Sparrow", "jack@pirate.com");
        //La llamada a este método disparará el evento.
        servicio.actualizar(usuario);

    }

}
