public abstract class Assinante {
    private static final int TAM = 100;
    private final long cpf;
    private final String nome;
    private final int numero;
    protected Chamada[] chamadas;
    protected int numChamadas;

    public Assinante(long cpf, String nome, int numero) {
        this.cpf = cpf;
        this.nome = nome;
        this.numero = numero;
        this.chamadas = new Chamada[TAM];
        this.numChamadas = 0;
    }

    public long getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        String saida = String.format("CPF: %s\nNome: %s\nNumero: %d\n", this.cpf, this.nome, this.numero);
        saida = saida.concat(String.format("Numero de Chamadas: %d\n", this.numChamadas));
        return saida;
    }
}
