import java.util.Calendar;
import java.util.Date;

public class PrePago extends Assinante {
    private static final int TAM = 100;
    private static final float CUSTO_POR_MINUTO = 1.45f;

    private float creditos;
    private final Recarga[] recargas;
    private int numRecargas;

    public PrePago(long cpf, String nome, int numero) {
        super(cpf, nome, numero);
        this.recargas = new Recarga[TAM];
        this.numRecargas = 0;
        this.creditos = 0;
    }

    public void recarregar(Date data, float valor) {
        if (numRecargas < TAM) {
            recargas[numRecargas++] = new Recarga(data, valor);
            creditos += valor;
            System.out.println("Recarga realizada com sucesso!\n");
        } else {
            System.out.println("Número máximo de recargas atingido!\n");
        }
    }

    public void fazerChamada(Date data, int duracao) {
        float custoChamada = duracao * CUSTO_POR_MINUTO;
        
        if (numChamadas < TAM) {
            if (creditos >= custoChamada) {
                chamadas[numChamadas++] = new Chamada(data, duracao);
                creditos -= custoChamada;
                System.out.println("Chamada realizada com sucesso!\n");
            } else {
                System.out.println("Créditos insuficientes para realizar a chamada!\n");
            }
        } else {
            System.out.println("Número máximo de chamadas atingido!\n");
        }
    }

    public void imprimirFatura(int mes) {
        float totalChamadas = 0;
        float totalRecargas = 0;

        System.out.println(this.toString());
        System.out.println("Fatura Pré-Pago - Mês: " + mes);
        System.out.println("Chamadas:");

        for (int i = 0; i < numChamadas; i++) {
            Chamada chamada = chamadas[i];
            Calendar cal = Calendar.getInstance();
            cal.setTime(chamada.getData());

            if (cal.get(Calendar.MONTH) == mes - 1) {
                float custo = chamada.getDuracao() * CUSTO_POR_MINUTO;
                System.out.printf("Chamada %d - Data: %s, Duração: %d min, Valor: R$ %.2f%n",
                        i + 1, chamada.getData(), chamada.getDuracao(), custo);
                totalChamadas += custo;
            }
        }

        System.out.println("\nRecargas:");
        for (int i = 0; i < numRecargas; i++) {
            Recarga recarga = recargas[i];
            Calendar cal = Calendar.getInstance();
            cal.setTime(recarga.getData());

            if (cal.get(Calendar.MONTH) == mes - 1) {
                System.out.printf("Recarga %d - Data: %s, Valor: R$ %.2f%n", 
                        i + 1, recarga.getData(), recarga.getValor());
                totalRecargas += recarga.getValor();
            }
        }

        System.out.printf("%nTotal de Chamadas: R$ %.2f%n", totalChamadas);
        System.out.printf("Total de Recargas: R$ %.2f%n", totalRecargas);
        System.out.printf("Créditos Restantes: R$ %.2f%n\n", creditos);
    }
}
