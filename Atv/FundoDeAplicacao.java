public class FundoDeAplicacao extends InstrumentoFinanceiro{
    float rentabilidade;

    public void setRentabilidade(float rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public float calcularSaldoTotal() {
        return this.rentabilidade+super.saldo;
    }
}
