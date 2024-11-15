public class JogadorCauteloso extends Jogador {

    public JogadorCauteloso(String nome) {
        super(nome);
    }

    @Override
    public void jogar(Mapa mapa) {
        andar();
        Propriedade propridade_atual = mapa.getPropriedades().get(getCasa_atual());
        if (propridade_atual.getDono() == null) {
            if (this.getCoins() > propridade_atual.getCusto() && (this.getCoins() - propridade_atual.getCusto()) > 80) {
                apropriar(propridade_atual);
            }
        }
        else {
            pagar(propridade_atual);
        }
    }
}