import java.util.Calendar;
import java.util.Date;

public class PosPago extends Assinante {
    private final float assinatura;
    private final float CUSTO_POR_MINUTO = 1.04f;

    public PosPago(long cpf, String nome, int numero, float assinatura) {
        super(cpf, nome, numero);
        this.assinatura = assinatura;
    }

    public void fazerChamada(Date data, int duracao) {
        if (numChamadas < chamadas.length) {
            Chamada chamada = new Chamada(data, duracao);
            chamadas[numChamadas++] = chamada;
        } else {
            System.out.println("Número Máximo de Chamadas Atingido!\n");
        }
    }

    public void imprimirFatura(int mes) {
        System.out.println("Fatura do Assinante Pós-Pago:");
        System.out.println(this.toString() + "Chamadas:\n");

        float totalCustoChamadas = 0;
        for (int i = 0; i < this.numChamadas; i++) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(this.chamadas[i].getData());
            if (cal.get(Calendar.MONTH) == mes-1) {
                float custoChamada = this.chamadas[i].getDuracao() * CUSTO_POR_MINUTO;
                totalCustoChamadas += custoChamada;
                System.out.println(this.chamadas[i].toString() + "Custo: R$" + custoChamada + "\n");
            }
        }

        float valorTotal = assinatura + totalCustoChamadas;
        System.out.println("Valor total da fatura: R$ " + valorTotal + "\n");
    }
}
