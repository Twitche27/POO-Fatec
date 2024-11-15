import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jogo {
    public static Mapa gerarMapa() throws IOException {
        List<Propriedade> propriedades = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("gameConfig.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] valores = line.split(" ");
                propriedades.add(new Propriedade(Integer.parseInt(valores[0]), Integer.parseInt(valores[1])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrando.");
        }
        List<Jogador> Jogadores = new ArrayList<>();
        Collections.addAll(Jogadores, new JogadorImpulsivo("J1"), new JogadorExigente("J2"), new JogadorCauteloso("J3"), new JogadorAleatorio("J4"));
        return new Mapa(propriedades, Jogadores);
    }
    public static void main(String[] args) {
        try {
            Mapa mapa = gerarMapa();
            Jogador ganhador = mapa.getJogadores().get(0);
            int i;
            int time_outs = 0;
            List<Integer> qnt_turnos = new ArrayList<>();
            Map<String, Integer> qnt_ganhadores = new HashMap<>();
            for (Jogador jogador : mapa.getJogadores()) {
                qnt_ganhadores.put(jogador.getNome(), 0);
            }
            for (int j = 0; j < 300; j++) {
                Mapa mapa_atual = new Mapa(mapa);
                List<Jogador> jogadores = new ArrayList<>(mapa_atual.getJogadores());
                for (i = 0; i < 1000; i++) {
                    Jogador jogador_da_rodada = jogadores.get(i%jogadores.size());
                    jogador_da_rodada.jogar(mapa_atual);
                    if (jogador_da_rodada.getCoins() < 0) {
                        jogadores.remove(jogador_da_rodada);
                        if (jogadores.size() == 1) {
                            ganhador = jogadores.get(0);
                            break;
                        }
                    }
                }    
                if (i == 1000) {
                    time_outs++;
                    ganhador = jogadores.get(0);
                    for (Jogador jogador : jogadores) {
                        if (jogador.getCoins() > ganhador.getCoins()) {
                            ganhador = jogador;
                        }
                    }
                }
                qnt_turnos.add(i);
                qnt_ganhadores.put(ganhador.getNome(), qnt_ganhadores.get(ganhador.getNome())+1);
            }
            int soma_qnt_turnos = 0;
            for (Integer ints : qnt_turnos) {
                soma_qnt_turnos += ints;
            }
            double media_qnt_turnos = (double)soma_qnt_turnos / qnt_turnos.size();

            Integer valor_final = qnt_ganhadores.get("J1");
            String ganhador_final = (String) qnt_ganhadores.keySet().toArray()[0];
            for (Map.Entry<String, Integer> jogador : qnt_ganhadores.entrySet()) {
                if (jogador.getValue() > valor_final) {
                    valor_final = jogador.getValue();
                    ganhador_final = jogador.getKey();
                }
            }
            Jogador comportamento_vencedor = null;
            for (Jogador jogador : mapa.getJogadores()) {
                if (jogador.getNome().equals(ganhador_final)) {
                    comportamento_vencedor = jogador;
                }
            }
            System.out.println("Partidas terminadas por time out: " + Integer.toString(time_outs));
            System.out.printf("Média de turnos: %d\n", (int) media_qnt_turnos);
            System.out.println("Porcentagem de vitória do jogador impulsivo: " + qnt_ganhadores.get("J1")/3 + "%");
            System.out.println("Porcentagem de vitória do jogador exigente: " + qnt_ganhadores.get("J2")/3 + "%");
            System.out.println("Porcentagem de vitória do jogador cauteloso: " + qnt_ganhadores.get("J3")/3 + "%");
            System.out.println("Porcentagem de vitória do jogador aleatório: " + qnt_ganhadores.get("J4")/3 + "%");
            System.out.println("Comportamento que mais ganha: " + comportamento_vencedor.getClass().getSimpleName());
            
        }
        catch (IOException e) {
            System.out.println("Não foi possível gerar o mapa");
        }
    }
}