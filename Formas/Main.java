public class Main {
    public static void main(String[] args) throws Exception {
        Forma2D formaA = new Circulo();
        Forma2D formaB = new Quadrado();
        Forma2D formaC = new Triangulo();

        Desenho desenho = new Desenho();
        desenho.ilustrar(formaA);
    }
}
