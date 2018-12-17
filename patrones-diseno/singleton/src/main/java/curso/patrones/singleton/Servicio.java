package curso.patrones.singleton;

import java.util.List;

public class Servicio {

    private PersistenciaProducto persistenciaProducto;

    /*
    *  Única instancia que existirá de esta clase.
    * */
    private static Servicio instancia;

    /*
    * El constructor se hace privado para evitar que se puedan instancias usando new.
    * */
    private Servicio() {
        persistenciaProducto = new PersistenciaProducto();
    }

    /*
    * La instancia debe obtenerse a través de este método.
    * */
    public static Servicio getInstancia(){
        if(instancia == null) {
            instancia = new Servicio();
        }
        return instancia;
    }

    public double calcularImpuestoProducto(Producto producto) {

        //Validar producto.
        if (producto == null) return 0;

        final double IMPUESTO = 0.19;
        double impuestoProducto = producto.getPrecio() * IMPUESTO;
        return impuestoProducto;
    }

    public boolean guardarProducto(Producto nuevoProducto) {

        if(nuevoProducto == null) return false;

        //Validar producto
        String nombre = nuevoProducto.getNombre();

        if (nuevoProducto.getProductoId() < 0 || nombre == null || nombre.isEmpty()) {
            return false;
        }
        return persistenciaProducto.insertar(nuevoProducto);

    }

    public List<Producto> listarProductos()
    {

        return persistenciaProducto.listarProductos();
    }


}
