package curso.patrones.metodo_fabrica;

public class Tienda {

    public double calcularCostoEnvio(Orden orden) {

        if (orden == null) return -1;

        GeneradorCreadorEnvio generador = GeneradorCreadorEnvio.obtenerInstancia();
        CreadorEnvio creador = generador.obtenerCreadorEnvio(orden.getPais());
        CalculoEnvio calculo = creador.fabricar();

        return calculo.calcular(orden);

    }
}
