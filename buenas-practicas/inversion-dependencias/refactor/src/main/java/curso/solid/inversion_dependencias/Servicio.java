package curso.solid.inversion_dependencias;

import java.util.List;

public class Servicio {

    private RepositorioProducto repositorio;

    public Servicio(RepositorioProducto repositorio) {
        this.repositorio = repositorio;
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

        repositorio.guardar(nuevoProducto);
        return true;
    }

    public List<Producto> listarProductos() {

        List<Producto> productos = repositorio.listar();
        return productos;
    }

}
