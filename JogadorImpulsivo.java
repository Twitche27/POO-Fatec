public class JogadorImpulsivo extends Jogador{

    public JogadorImpulsivo(String nome, Mapa mapa) {
        super(nome, mapa);
    }
    
    @Override
    public void jogar() {
        andar();
        Propriedade propridade_atual = mapa.getMapa().get(casa_atual);
        if (propridade_atual.getDono() == null) {
            if (this.coins > propridade_atual.getCusto_venda()) {
                apropriar(propridade_atual);
            }
        }
        else {
            pagar(propridade_atual);
        }
        
    }

}
