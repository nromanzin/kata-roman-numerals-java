import java.util.LinkedHashMap;
import java.util.Map;

public class Converter {

    private final Map<Integer, String> conversionMap = new LinkedHashMap<>(
            Map.of(
                    10, "X",
                    9, "IX",
                    5, "V",
                    4, "IV",
                    1, "I"
            ));

    public String toRoman(int number) {
        StringBuilder roman = new StringBuilder();
        while (number > 0) {
            int finalNumber = number;
            int closestInferiorKey = conversionMap.keySet().stream()
                    .filter(key -> key <= finalNumber)
                    .findFirst().orElseThrow();
            roman.append(conversionMap.get(closestInferiorKey));
            number -= closestInferiorKey;
        }
        return roman.toString();
    }
}
