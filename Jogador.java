import java.util.Random;

public abstract class Jogador {
    protected  final String nome;
    protected int coins;
    protected int casa_atual;
    protected Mapa mapa;

    public Jogador(String nome, Mapa mapa) {
        this.nome = nome;
        this.coins = 300;
        this.casa_atual = 0;
        this.mapa = mapa;
    }

    protected void apropriar(Propriedade propriedade) {
        propriedade.setDono(this);
    }

    public String getNome() {
        return this.nome;
    }

    public int getCoins() {
        return this.coins;
    }

    protected void addCoins(int coins) {
        this.coins += coins;
    }

    public abstract void jogar();

    protected int andar() {
        int casas_andadas = new Random().nextInt(6) + 1;
        if ((this.casa_atual + casas_andadas) >= 20) {
            this.casa_atual = (this.casa_atual + casas_andadas) - 20;
            addCoins(100);;
        }
        else{
            this.casa_atual += casas_andadas;
        }
        return this.casa_atual;
    }

    protected void pagar(Propriedade propriedade) {
        propriedade.getDono().addCoins(propriedade.getCusto_aluguel());
        addCoins(-propriedade.getCusto_aluguel());
    }
}