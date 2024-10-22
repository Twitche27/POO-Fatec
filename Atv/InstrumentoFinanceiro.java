public abstract class InstrumentoFinanceiro {
    float saldo;

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public abstract float calcularSaldoTotal();
}
