import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Recarga {
    private Date data;
    private float valor;

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

    public String toString() {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        return "Data:" +  formatter.format(this.data) + "\nValor:" + this.valor;
    }

}