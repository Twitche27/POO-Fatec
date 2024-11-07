public abstract class Assinante {
    private final long cpf;
    private final String nome;
    private final int numero;
    protected Chamada[] chamadas;
    protected int numChamadas;

    public Assinante(long cpf, String nome, int numero) {
        this.cpf = cpf;
        this.nome = nome;
        this.numero = numero;
        this.chamadas = new Chamada[100];
        this.numChamadas = this.chamadas.length;
    }

    public long getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        String saida = String.format("CPF: %s\nNome: %s\nNumero: %d\n", this.cpf, this.nome, this.numero);
        // for (int i = 0; i < this.chamadas.length; i++) {
        //     saida = saida.concat(String.format("Chamada %d\n", i+1)).concat(this.chamadas[i].toString());
        // }
        saida = saida.concat(String.format("Numero de Chamadas: %d\n", this.numChamadas));
        return saida;
    }
}
