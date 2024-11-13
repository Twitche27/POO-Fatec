
import java.util.Random;

public class JogadorAleatorio extends Jogador {

    public JogadorAleatorio(String nome, Mapa mapa) {
        super(nome, mapa);
    }

    @Override
    public void jogar() {
        andar();
        Propriedade propridade_atual = mapa.getMapa().get(casa_atual);
        if (propridade_atual.getDono() == null) {
            if (this.getCoins() > propridade_atual.getCusto_venda() && new Random().nextBoolean()) {
                apropriar(propridade_atual);
            }
        }
        else {
            pagar(propridade_atual);
        }
    }
    
}
