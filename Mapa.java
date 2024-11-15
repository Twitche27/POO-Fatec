import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private final List<Propriedade> propriedades;
    private final List<Jogador> jogadores;

    public Mapa(Mapa outroMapa) {
        this.propriedades = new ArrayList<>();
        for (Propriedade propriedade : outroMapa.getPropriedades()) {
            this.propriedades.add(new Propriedade(propriedade));
        }

        this.jogadores = new ArrayList<>();
        for (Jogador jogador : outroMapa.getJogadores()) {
            this.jogadores.add(jogador.copia());
        }
    }

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
