package curso.solid.abierto_cerrado;

public class Tienda {

    public double calcularCostoEnvio(Orden orden) {

        if (orden == null) return -1;

        CreadorCalculo op = new CreadorCalculo();
        //CreadorCalculoMap op = new CreadorCalculoMap();
        //CreadorCalculoReflexion op = new CreadorCalculoReflexion();

        CalculoEnvio calculo = op.obtenerInstancia(orden.getPais());

        return calculo.calcular(orden);

    }
}
