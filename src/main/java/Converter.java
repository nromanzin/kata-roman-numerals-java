import java.util.LinkedHashMap;
import java.util.Map;

public class Converter {

    private final Map<Integer, String> conversionMap;

    public Converter() {
        this.conversionMap = new LinkedHashMap<>();
        this.conversionMap.put(1000, "M");
        this.conversionMap.put(900, "CM");
        this.conversionMap.put(500, "D");
        this.conversionMap.put(400, "CD");
        this.conversionMap.put(100, "C");
        this.conversionMap.put(90, "XC");
        this.conversionMap.put(50, "L");
        this.conversionMap.put(40, "XL");
        this.conversionMap.put(10, "X");
        this.conversionMap.put(9, "IX");
        this.conversionMap.put(5, "V");
        this.conversionMap.put(4, "IV");
        this.conversionMap.put(1, "I");
    }

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
