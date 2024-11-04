import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Animal> lista = new ArrayList<Animal>();
        lista.add(new Gato("Pink", 5));
        lista.add(new Cachorro("Covarde", 15));
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).fazerSom();
        }
    }
}
