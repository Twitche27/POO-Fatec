import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Telefonia {
    private static final int TAM = 100;

    private final PrePago[] prePagos;
    private int numPrePagos;
    private final PosPago[] posPagos;
    private int numPosPagos;

    public Telefonia() {
        prePagos = new PrePago[TAM];
        numPrePagos = 0;
        posPagos = new PosPago[TAM];
        numPosPagos = 0;
    }

    public void cadastrarAssinante() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o tipo de assinante (1- Pré-Pago, 2- Pós-Pago): ");
            int tipo = scanner.nextInt();

            System.out.print("CPF: ");
            long cpf = scanner.nextLong();
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Número do telefone: ");
            int numero = scanner.nextInt();

            if (tipo == 1 && numPrePagos < TAM) {
                prePagos[numPrePagos++] = new PrePago(cpf, nome, numero);
                System.out.println("Assinante pré-pago cadastrado com sucesso!");
            } else if (tipo == 2 && numPosPagos < TAM) {
                System.out.print("Valor da assinatura: ");
                float assinatura = scanner.nextFloat();
                posPagos[numPosPagos++] = new PosPago(cpf, nome, numero, assinatura);
                System.out.println("Assinante pós-pago cadastrado com sucesso!");
            } else {
                System.out.println("Erro ao cadastrar assinante! Verifique o tipo ou se há espaço para cadastro.");
            }
        }
    }

    public void listarAssinantes() {
        System.out.println("Assinantes Pré-Pagos:");
        for (int i = 0; i < numPrePagos; i++) {
            System.out.println(prePagos[i].toString());
        }
        System.out.println("\nAssinantes Pós-Pagos:");
        for (int i = 0; i < numPosPagos; i++) {
            System.out.println(posPagos[i].toString());
        }
    }

    public void fazerChamada() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o tipo de assinante (1- Pré-Pago, 2- Pós-Pago): ");
            int tipo = scanner.nextInt();

            System.out.print("CPF do assinante: ");
            long cpf = scanner.nextLong();

            System.out.print("Data da chamada (dd/mm/yyyy): ");
            String dataStr = scanner.next();
            Date data = parseData(dataStr);

            System.out.print("Duração da chamada (em minutos): ");
            int duracao = scanner.nextInt();

            switch (tipo) {
                case 1 ->                 {
                        PrePago assinante = localizarPrePago(cpf);
                        if (assinante != null) {
                            assinante.fazerChamada(data, duracao);
                        } else {
                            System.out.println("Assinante pré-pago não encontrado!");
                        }                      }
                case 2 ->                 {
                        PosPago assinante = localizarPosPago(cpf);
                        if (assinante != null) {
                            assinante.fazerChamada(data, duracao);
                        } else {
                            System.out.println("Assinante pós-pago não encontrado!");
                        }                      }
                default -> System.out.println("Tipo de assinante inválido!");
            }
        }
    }

    public void fazerRecarga() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("CPF do assinante pré-pago: ");
            long cpf = scanner.nextLong();

            System.out.print("Data da recarga (dd/mm/yyyy): ");
            String dataStr = scanner.next();
            Date data = parseData(dataStr);

            System.out.print("Valor da recarga: ");
            float valor = scanner.nextFloat();

            PrePago assinante = localizarPrePago(cpf);
            if (assinante != null) {
                assinante.recarregar(data, valor);
            } else {
                System.out.println("Assinante pré-pago não encontrado!");
            }
        }
    }

    public void imprimirFaturas() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o mês para a fatura (1-12): ");
            int mes = scanner.nextInt();

            System.out.println("Faturas dos Assinantes Pré-Pagos:");
            for (int i = 0; i < numPrePagos; i++) {
                prePagos[i].imprimirFatura(mes);
            }

            System.out.println("\nFaturas dos Assinantes Pós-Pagos:");
            for (int i = 0; i < numPosPagos; i++) {
                posPagos[i].imprimirFatura(mes);
            }
        }
    }

    private PrePago localizarPrePago(long cpf) {
        for (int i = 0; i < numPrePagos; i++) {
            if (prePagos[i].getCpf() == cpf) {
                return prePagos[i];
            }
        }
        return null;
    }

    private PosPago localizarPosPago(long cpf) {
        for (int i = 0; i < numPosPagos; i++) {
            if (posPagos[i].getCpf() == cpf) {
                return posPagos[i];
            }
        }
        return null;
    }

    private Date parseData(String dataStr) {
        try {
            String[] partes = dataStr.split("/");
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]) - 1;
            int ano = Integer.parseInt(partes[2]);

            Calendar cal = Calendar.getInstance();
            cal.set(ano, mes, dia);
            return cal.getTime();
        } catch (NumberFormatException e) {
            System.out.println("Erro ao parsear a data. Usando data atual.");
            return new Date();
        }
    }
}
