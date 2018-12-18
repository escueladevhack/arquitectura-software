package curso.patrones.metodo_fabrica;

public class Orden {

    private Pais pais;
    private double peso;
    private double total;

    public Orden(Pais pais, double peso, double total) {
        this.pais = pais;
        this.peso = peso;
        this.total = total;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
