import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista = new LinkedList<>();

        lista.add("Astoufo");
        lista.add("Euberto");
        lista.add("Carlos");
        lista.add("Anastacia");
        lista.add("Eliana");
        lista.add("Gabriele");

        Collections.sort(lista);

        System.out.println(lista);

    }
}