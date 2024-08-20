package Heranca;

public class MainAnimal {
    public static void main(String args[]) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        System.out.println(animal.fazerSom());
        System.out.println(cachorro.fazerSom());
        System.out.println(gato.fazerSom());
    }
}
