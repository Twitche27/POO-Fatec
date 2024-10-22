public class ContaCorrente extends InstrumentoFinanceiro {
    float limite;

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float calcularSaldoTotal() {
        return this.limite+super.saldo;
    }
}
