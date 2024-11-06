import java.util.Date;

public class Chamada {
    private final Date data;
    private final int duracao;

    public Chamada(Date data, int duracao) {
        this.data = data;
        this.duracao = duracao;
    }

    public Date getData() {
        return data;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return String.format("Data: %tF %1$tT\nDuracao: %ds\n", this.data, this.duracao);
    }
}
