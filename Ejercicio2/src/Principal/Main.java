package Principal;

public class Main {
    public static void main(String[] args) {

        Coche carro = new Coche("Negro", 2023, 4,"Chevrolet", 1600, 4);
        System.out.println(carro.toString());

        Bicicleta bici = new Bicicleta("Plateado", 2022, 2, "GW", "Ruta", 8);
        System.out.println(bici.toString());
    }
}