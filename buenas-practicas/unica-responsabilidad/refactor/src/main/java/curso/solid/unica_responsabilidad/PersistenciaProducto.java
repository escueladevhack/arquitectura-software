package curso.solid.unica_responsabilidad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaProducto {

    private static Connection connection;

    public PersistenciaProducto()
    {
        initializarBaseDatos();
    }

    public boolean insertar(Producto nuevoProducto)
    {

        String insertSQL = "INSERT INTO Product ( ProductId, Name, Price ) " +
                "VALUES (?, ?, ?)";

        try(PreparedStatement statement = connection.prepareStatement(insertSQL)) {
            statement.setInt(1, nuevoProducto.getProductoId());
            statement.setString(2, nuevoProducto.getNombre());
            statement.setDouble(3, nuevoProducto.getPrecio());

            statement.executeUpdate();
            return true;
        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
            return false;
        }
    }

    public List<Producto> listarProductos() {

        List<Producto> productos = new ArrayList<>();

        String querySQL = "SELECT ProductId, Name, Price FROM Product";

        try(Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(querySQL))

        {
            while (results.next())
            {

                Producto producto = new Producto(results.getInt("ProductId"),
                        results.getString("Name"),
                        results.getDouble("Price"));
                productos.add(producto);
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }


        return productos;
    }

    private void initializarBaseDatos() {

        try {
            //Parámetros de la base de datos en memoria.

            String url = "jdbc:sqlite::memory:";
            //Crear conexión a la base de datos
            connection = DriverManager.getConnection(url);

            System.out.println("La conexión con SQLite ha sido establecida.");

            // Crear tabla que guarda las propiedades.
            try(Statement statement = connection.createStatement()) {

                String createTableSQL = "CREATE TABLE Product (\n"
                        + " ProductId INTEGER PRIMARY KEY,\n"
                        + " Name text not null,\n"
                        + " Price REAL)";
                statement.execute(createTableSQL);

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}