import java.util.Calendar;
import java.util.Date;

public class PrePago extends Assinante{
    private float creditos;
    private Recarga[] recargas;
    private int NumRecargas;

    public PrePago(long cpf, String nome, int numero) {
        super(cpf, nome, numero);
        this.recargas = new Recarga[100];
        this.NumRecargas = this.recargas.length;
    }

    public void recarregar(Date data, float valor) {
        if (this.NumRecargas < this.recargas.length) {
            recargas[this.NumRecargas] = new Recarga(data, valor);
            this.creditos += recargas[this.NumRecargas].getValor();
            this.NumRecargas = this.recargas.length;
        }
        else {
            System.out.println("Número Máximo de Recargas Atingido!");
        }
        
    }

    public void fazerChamada(Date data, int duracao) {
        if (this.numChamadas < this.chamadas.length) {
            if (this.creditos >= duracao*1.45) {
                chamadas[this.numChamadas] = new Chamada(data, duracao);
                this.creditos -= chamadas[this.numChamadas].getDuracao()*1.45;
                this.numChamadas = this.recargas.length;
            }
            else {
                System.out.println("Saldos Insuficientes Para Realizar a Chamada!");
            }
        }
        else {
            System.out.println("Número Máximo de Chamadas Atingido!");
        }
    }

    public void imprimirFatura(int mes) {
        String saida = super.toString();
        for (int i = 0; i < this.chamadas.length; i++) {
            Calendar dataChamada = Calendar.getInstance();
            dataChamada.setTime(this.chamadas[i].getData());
            if (dataChamada.get(Calendar.MONTH) == mes) {
                saida = saida.concat(String.format("Chamada %d\n", i+1)).concat(this.chamadas[i].toString());
            }
            
        }
        saida = saida.concat(String.format("Número de Recargas: %d\n", this.NumRecargas)).concat("Recargas:\n");
        for (int i = 0; i < this.recargas.length; i++) {
            Calendar dataChamada = Calendar.getInstance();
            dataChamada.setTime(this.chamadas[i].getData());
            if (dataChamada.get(Calendar.MONTH) == mes) {
                saida = saida.concat(String.format("Recarga %d\n", i+1)).concat(this.recargas[i].toString());
            }
        }
        System.out.println(saida);
    }
}
