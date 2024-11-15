
import java.util.List;

public class Mapa {
    private final List<Propriedade> propriedades;
    private final List<Jogador> jogadores;

    public Mapa(List<Propriedade> propriedades, List<Jogador> jogadores) {
        this.propriedades = propriedades;
        this.jogadores = jogadores;
    }

    public List<Propriedade> getPropriedades() {
        return propriedades;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }
}
