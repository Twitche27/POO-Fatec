public class Maincarro {
    public static void main(String Args[]) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020, "preto");
        Carro carro2 = new Carro("Honda", "Civic", 2022, "prata");
        System.out.println(carro1.getAno());
        System.out.println(carro2.getModelo());
    }
}
