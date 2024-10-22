import java.util.ArrayList;
import java.util.List;

public class Banco {
    int numinstrumentos;
    List<InstrumentoFinanceiro> instrumentos = new ArrayList<InstrumentoFinanceiro>();

    public void adicionar(InstrumentoFinanceiro instrumento) {
        instrumentos.add(instrumento);
    }

    public float calcularSaldos() {
        float saldof = 0;
        for (int i = 0; i < instrumentos.size(); i++) {
            saldof += instrumentos.get(i).calcularSaldoTotal(); 
        } 
        return saldof;
    }

    public static void main() {

    }
}
