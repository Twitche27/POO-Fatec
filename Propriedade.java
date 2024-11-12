public class Propriedade {
    private int custo_venda;
    private int custo_aluguel;
    private Jogador dono;

    public Propriedade(int custo_venda, int custo_aluguel) {
        this.custo_venda = custo_venda;
        this.custo_aluguel = custo_aluguel;
        this.dono = null;
    }

    public void setDono(Jogador jogador) {
        this.dono = jogador;
    }
}
