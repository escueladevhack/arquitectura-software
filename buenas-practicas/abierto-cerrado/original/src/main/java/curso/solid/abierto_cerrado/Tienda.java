package curso.solid.abierto_cerrado;

public class Tienda {

    public double calcularCostoEnvio(Orden orden) {

        if (orden == null) return -1;

        double resultado = 0;

        switch (orden.getPais())
        {
            case Colombia:

                resultado = orden.getTotal() * 0.01;
                if (orden.getPeso() <= 2)
                {
                    resultado += 3500;
                }
                else {
                    resultado += orden.getPeso() * 1500;
                }

                break;
            case Mexico:
                resultado = 98;
                break;
        }

        return resultado;

    }
}
