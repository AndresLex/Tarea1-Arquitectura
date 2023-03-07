package Principal;

public class Coche extends Vehiculo{
    private int cilindraje;
    private int puertas;

    public Coche(String color, int numeroSerie, int numeroRuedas, String marca, int cilindraje, int puertas) {
        super(color, numeroSerie, numeroRuedas, marca);
        this.cilindraje = cilindraje;
        this.puertas = puertas;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "cilindraje=" + cilindraje +
                ", puertas=" + puertas +
                '}'+super.toString();
    }
}
