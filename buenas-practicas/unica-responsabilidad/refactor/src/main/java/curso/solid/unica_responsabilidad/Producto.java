package curso.solid.unica_responsabilidad;

public class Producto {

    private int productoId;
    private String nombre;
    private double precio;

    public Producto(int productoId, String nombre, double precio) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
