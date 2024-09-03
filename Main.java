public class Main {

    public static void setCarroModelo(Carro carro) {
        carro.setModelo("Modelo B");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Carro carro = new Carro();
        Carro carroA = new Carro("Modelo A", 2024, "Ferrari");
        carro.setModelo("Modelo A");

        System.out.println(carro.getModelo());

        setCarroModelo(carro);

        System.out.println(carro.getModelo());
    }
}
