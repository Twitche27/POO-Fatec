public class JogadorImpulsivo extends Jogador{

    public JogadorImpulsivo(String nome) {
        super(nome);
    }
    
    @Override
    public void jogar(Mapa mapa) {
        andar();
        Propriedade propridade_atual = mapa.getPropriedades().get(getCasa_atual());
        if (propridade_atual.getDono() == null) {
            if (this.getCoins() > propridade_atual.getCusto()) {
                apropriar(propridade_atual);
            }
        }
        else {
            pagar(propridade_atual);
        }  
    }
}