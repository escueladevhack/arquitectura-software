package curso.patrones.observador.eventos;

import curso.patrones.observador.entidades.Usuario;

import java.util.Date;

/**
 * Objeto que contiene la información básica de un evento
 * asociado a un usuario.
 * */
public class EventoUsuario {

    private Date fecha;
    private Usuario usuario;
    private TipoEventoUsuario tipo;

    public EventoUsuario(Usuario usuario, TipoEventoUsuario tipo, Date fecha) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.tipo = tipo;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public TipoEventoUsuario getTipo() {
        return tipo;
    }

    /**
     * Tipo de evento relacionado con el usuario.
     * */
    public enum TipoEventoUsuario {
        CREADO, ACTUALIZADO, ELIMINADO
    }
}