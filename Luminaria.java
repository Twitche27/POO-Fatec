public class Luminaria {
    private boolean estado;
    private int intensidade;
    
    public void Ligar() {
        this.estado = true;
    }

    public void Desligar() {
        this.estado = false;
    }

    public void ajustarIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }
}
