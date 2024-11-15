public class Propriedade {
    private final int custo_venda;
    private final int custo_aluguel;
    private Jogador dono;

    public Propriedade(int custo_venda, int custo_aluguel) {
        this.custo_venda = custo_venda;
        this.custo_aluguel = custo_aluguel;
        this.dono = null;
    }

    public Jogador getDono() {
        return dono;
    }

    public void setDono(Jogador jogador) {
        this.dono = jogador;
    }

    public int getCusto_aluguel() {
        return custo_aluguel;
    }

    public int getCusto_venda() {
        return custo_venda;
    }
}
