import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> prodotti1 = new HashMap<>();
        prodotti1.put("ZW", 326);
        prodotti1.put("CO", 994);
        prodotti1.put("SP", 135);
        System.out.println("primo metodo " + prodotti1);

        Map<String, Integer> prodotti2 = Map.of("ZW", 326, "CO", 994, "SP", 135);
        System.out.println("secondo metodo " + prodotti2);

        Map<String, Integer> prodotti3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("ZW", 326),
                new AbstractMap.SimpleEntry<>("CO", 994),
                new AbstractMap.SimpleEntry<>("SP", 135)
        );
        System.out.println("terzo metodo " + prodotti3);
    }
}
