import java.util.*;

public class SymbolsRepetitions {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String inputLine = input.next();
            ArrayList<String> arrChars = new ArrayList<>(Arrays.asList(inputLine.split("")));

            Map<String, Integer> mapChars = new HashMap<String, Integer>();
            for (String element : arrChars) {
                if (!mapChars.containsKey(element)) {
                    mapChars.put(element, 1);
                } else {
                    mapChars.put(element, mapChars.get(element) + 1);
                }
            }
            Map.Entry<String, Integer> result = mapChars.entrySet().stream().max(Map.Entry.comparingByValue()).get();

            System.out.printf("['%s', %d]", result.getKey(), result.getValue());
        }
    }
}
