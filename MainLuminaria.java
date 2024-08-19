public class MainLuminaria {

    public static void testLuminaria(boolean estado) {
        if (estado) {
            System.out.println("A luminaria está ligada!");
        }
        else {
            System.out.println("A luminária está desligada!");
        }
    }
    public static void main(String args[]) {
        Luminaria luminaria = new Luminaria();
        luminaria.ligar();
        testLuminaria(luminaria.getEstado());
        luminaria.desligar();
        testLuminaria(luminaria.getEstado());
        System.out.println(luminaria.getIntensidade());
        luminaria.ajustarIntensidade(55);
        System.out.println(luminaria.getIntensidade());
        
    }
}
