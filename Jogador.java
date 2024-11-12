import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Jogador {
    private String nome;
    private int coins;
    private int casa_atual;
    private List<Propriedade> propriedades;

    public Jogador(String nome) {
        this.nome = nome;
        this.coins = 300;
        this.casa_atual = 0;
        this.propriedades = new ArrayList<>();
    }

    public void apropriar(Propriedade propriedade) {
        propriedade.setDono(this);
        this.propriedades.add(propriedade);
    }

    public String getNome() {
        return this.nome;
    }

    public int getCoins() {
        return this.coins;
    }

    public void addCoins(int coins) {
        this.coins += coins;
    }

    public void andar() {
        int casas_andadas = new Random().nextInt(6) + 1;
        if ((this.casa_atual + casas_andadas) > 20) {
            this.casa_atual = (this.casa_atual + casas_andadas) - 20;
            this.coins += 100;
        }
        else {
            this.casa_atual += casas_andadas;
        }
    }

    
}

public 