public class JogadorExigente extends Jogador {

    public JogadorExigente(String nome) {
        super(nome);
    }

    @Override
    public void jogar(Mapa mapa) {
        andar();
        Propriedade propridade_atual = mapa.getPropriedades().get(getCasa_atual());
        if (propridade_atual.getDono() == null) {
            if (this.getCoins() > propridade_atual.getCusto_venda() && propridade_atual.getCusto_aluguel() > 50) {
                apropriar(propridade_atual);
            }
        }
        else {
            pagar(propridade_atual);
        }
    }
    
}
