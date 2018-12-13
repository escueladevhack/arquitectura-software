package curso.solid.abierto_cerrado;

import static curso.solid.abierto_cerrado.Pais.*;

public class Aplicacion {

    public static void main(String[] args) {

        Tienda tienda = new Tienda();

        Orden ordenUno = new Orden(Mexico, 1, 8000);
        Orden ordenDos = new Orden(Colombia, 10, 100000);

        double costoUno = tienda.calcularCostoEnvio(ordenUno);
        System.out.format("Costo orden 1: %.0f pesos mexicanos", costoUno);
        System.out.println();

        double costoDos = tienda.calcularCostoEnvio(ordenDos);
        System.out.format("Costo orden 2: %.0f pesos colombianos", costoDos);

    }

}
