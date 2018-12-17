package curso.solid.inversion_dependencias;

import java.util.List;

public interface RepositorioProducto {

    void guardar(Producto nuevoProducto);

    List<Producto> listar();

}
