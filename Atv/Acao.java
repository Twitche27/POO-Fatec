public class Acao extends InstrumentoFinanceiro{
    int cotas;

    public void setCotas(int cotas) {
        this.cotas = cotas;
    }

    public float calcularSaldoTotal() {
        return this.cotas*super.saldo;
    }
}
