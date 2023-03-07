package Principal;

public class Bicicleta extends Vehiculo{
    private String tipoBicicleta;
    private int numeroCambios;

    public Bicicleta(String color, int numeroSerie, int numeroRuedas, String marca, String tipoBicicleta, int numeroCambios) {
        super(color, numeroSerie, numeroRuedas, marca);
        this.tipoBicicleta = tipoBicicleta;
        this.numeroCambios = numeroCambios;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public int getNumeroCambios() {
        return numeroCambios;
    }

    public void setNumeroCambios(int numeroCambios) {
        this.numeroCambios = numeroCambios;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "tipoBicicleta='" + tipoBicicleta + '\'' +
                ", numeroCambios=" + numeroCambios +
                '}'+super.toString();
    }
}
