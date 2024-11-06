import java.util.Date;

public class PrePago extends Assinante{
    private float creditos;
    private Recarga[] recargas;
    private int NumRecargas;

    public PrePago(long cpf, String nome, int numero, float creditos, int numRecargas) {
        super(cpf, nome, numero);
        this.creditos = creditos;
        this.NumRecargas = numRecargas;
        this.recargas = new Recarga[100];
        this.NumRecargas = this.recargas.length;
    }

    public void recarregar(Date data, float valor) {

    }

    public void fazerChamada(Date data, int duracao) {

    }
}
