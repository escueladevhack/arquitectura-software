package curso.solid.inversion_dependencias;

import java.util.List;

public class Aplicacion {

    public static void main(String[] args)
    {

        RepositorioProducto repositorio = new RepositorioProductoSqlite();
        Servicio servicio = new Servicio(repositorio);

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
