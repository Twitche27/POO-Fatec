
import java.util.Random;

public class JogadorAleatorio extends Jogador {

    public JogadorAleatorio(String nome) {
        super(nome);
    }

    @Override
    public void jogar(Mapa mapa) {
        andar();
        Propriedade propridade_atual = mapa.getPropriedades().get(getCasa_atual());
        if (propridade_atual.getDono() == null) {
            if (this.getCoins() > propridade_atual.getCusto() && new Random().nextBoolean()) {
                apropriar(propridade_atual);
            }
        }
        else {
            pagar(propridade_atual);
        }
    }
}