package Esfera;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Esfera {
    private float raio;

    public Esfera() {

    }

    public Esfera(float raio) {
        this.raio = raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float calcularVolume() {
        return (float) ((4/3) * PI * (pow(this.raio, 3)));
    }

    public float calcularArea() {
        return (float) (4*PI*(pow(this.raio, 2)));
    }

    public static void main(String[] args) {
        Esfera esfera = new Esfera(5);
        System.out.println(esfera.calcularVolume());
        System.out.println(esfera.calcularArea());
    }
}
