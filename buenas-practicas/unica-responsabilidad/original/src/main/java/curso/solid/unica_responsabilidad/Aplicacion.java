package curso.solid.unica_responsabilidad;

import java.util.List;

public class Aplicacion {

    public static void main(String[] args) {

        Servicio servicio = new Servicio();
        Producto producto = new Producto(1, "Producto Uno", 100);

        System.out.println(servicio.calcularImpuestoProducto(producto));

        servicio.guardarProducto(producto);

        List<Producto> productos = servicio.listarProductos();
        for(Producto productoActual: productos)
        {
            System.out.format("Id: %d, nombre: %s",
                                productoActual.getProductoId(),
                                productoActual.getNombre());
        }

    }

}
