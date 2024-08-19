public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public String get_marca() {
        return this.marca;
    }

    public String get_modelo() {
        return this.modelo;
    }

    public int get_ano(){
        return this.ano;
    }

    public String get_cor() {
        return this.cor;
    }
}
