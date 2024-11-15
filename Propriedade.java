public class Propriedade {
    private final int custo;
    private final int custo_aluguel;
    private Jogador dono;

    public Propriedade(int custo, int custo_aluguel) {
        this.custo = custo;
        this.custo_aluguel = custo_aluguel;
        this.dono = null;
    }

    public Propriedade(Propriedade outra) {
        this.custo = outra.custo;
        this.custo_aluguel = outra.custo_aluguel;
        this.dono = null;
    }

    public int getCusto() {
        return custo;
    }

    public int getCusto_aluguel() {
        return custo_aluguel;
    }

    public Jogador getDono() {
        return dono;
    }

    public void setDono(Jogador dono) {
        this.dono = dono;
    }
}
