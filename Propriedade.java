public class Propriedade {
    private final int numero;
    private final int custo_venda;
    private final int custo_aluguel;
    private Jogador dono;

    public Propriedade(int numero, int custo_venda, int custo_aluguel) {
        this.numero = numero;
        this.custo_venda = custo_venda;
        this.custo_aluguel = custo_aluguel;
        this.dono = null;
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

    public Jogador getDono() {
        return dono;
    }

    
}
