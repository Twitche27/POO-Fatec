import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Recarga rec = new Recarga(new Date(), (float) 88.66);
        Chamada cham = new Chamada(new Date(), 28);
        System.out.println(rec.toString());
        System.out.println(cham.toString());        
    }
}
