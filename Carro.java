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

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public String getCor() {
        return this.cor;
    }
}
