import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Recarga rec = new Recarga(new Date(), (float) 88.66);
        Chamada cham = new Chamada(new Date(), 28);
        PosPago prep = new PosPago(1, "null", 61234, 3532);
        // prep.recarregar(new Date(), (float) 500);
        prep.fazerChamada(new Date(), 25);
        prep.fazerChamada(new Date(), 25);
        prep.fazerChamada(new Date(), 25);
        prep.fazerChamada(new Date(), 25);
        prep.imprimirFatura(11);

        PrePago prep2 = new PrePago(1, "null", 61234);
        prep2.recarregar(new Date(), (float) 500);
        prep2.fazerChamada(new Date(), 25);
        prep2.imprimirFatura(11);
        System.out.println(rec.toString());
        System.out.println(cham.toString());        
    }
}
