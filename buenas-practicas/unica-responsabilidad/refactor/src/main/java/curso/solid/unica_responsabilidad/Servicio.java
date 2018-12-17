package curso.solid.unica_responsabilidad;

import java.util.List;

public class Servicio {

    private PersistenciaProducto persistenciaProducto;

    public Servicio() {
        persistenciaProducto = new PersistenciaProducto();
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
