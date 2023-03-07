package Principal;

public class Vehiculo {
    private String color;
    private int numeroSerie;
    private int numeroRuedas;
    private String marca;

    public Vehiculo(String color, int numeroSerie, int numeroRuedas, String marca) {
        this.color = color;
        this.numeroSerie = numeroSerie;
        this.numeroRuedas = numeroRuedas;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "color='" + color + '\'' +
                ", numeroSerie=" + numeroSerie +
                ", numeroRuedas=" + numeroRuedas +
                ", marca='" + marca + '\'' +
                '}';
    }
}
