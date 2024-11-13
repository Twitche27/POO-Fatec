public class JogadorCauteloso extends Jogador {

    public JogadorCauteloso(String nome, Mapa mapa) {
        super(nome, mapa);
    }

    @Override
    public void jogar() {
        andar();
        Propriedade propridade_atual = mapa.getMapa().get(casa_atual);
        if (propridade_atual.getDono() == null) {
            if (this.getCoins() > propridade_atual.getCusto_venda() && (this.getCoins() - propridade_atual.getCusto_venda()) > 80) {
                apropriar(propridade_atual);
            }
        }
        else {
            pagar(propridade_atual);
        }
    }
    
}
