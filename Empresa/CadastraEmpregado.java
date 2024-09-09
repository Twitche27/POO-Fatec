package Empresa;
import java.util.Scanner;

public class CadastraEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do empregado: ");
        empregado.setNome(scanner.nextLine());
        System.out.println("Digite o salário do empregado: ");
        empregado.setSalario(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Digite a razão social da empresa: ");
        empresa.setRazaoSocial(scanner.nextLine());
        System.out.println("Digite o CNPJ da empresa: ");
        empresa.setCnpj(scanner.nextLine());
        System.out.println("Digite o fone da empresa: ");
        empresa.setFone(scanner.nextLine());
        empregado.setEmpresa(empresa);

        System.out.printf("Nome do empregado: %s\n", empregado.getNome());
        System.out.printf("Salário do empregado: %f\n", empregado.getSalario());
        System.out.printf("Empresa do empregado: \n   Razão social da empresa: %s\n   CNPJ da empresa: %s\n   Fone da empresa: %s\n", empregado.getEmpresa().getRazaoSocial(), empregado.getEmpresa().getCnpj(), empregado.getEmpresa().getFone());
        System.out.printf("");
    }
}
