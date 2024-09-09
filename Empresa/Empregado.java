package Empresa;

public class Empregado {
    private String nome;
    private double salario;
    private Empresa empresa;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }
}
