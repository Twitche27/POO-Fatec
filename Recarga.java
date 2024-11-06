import java.util.Date;

public class Recarga {
    private final Date data;
    private final float valor;

    public Recarga(Date data, float valor) {
        this.data = data;
        this.valor = valor;
    }

    public Date getData() {
        return this.data;
    }

    public float getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return String.format("Data: %tF %1$tT\nvalor: R$%.2f\n", this.data, this.valor);
    }

}