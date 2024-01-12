import java.util.Map;

public class Converter {

    private Map<Integer, String> conversionMap = Map.of(
            10, "X",
            9, "IX",
            5, "V",
            4, "IV",
            1, "I"
    );

    public String toRoman(int number) {
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < number; i++) {
            roman.append("I");
        }
        return roman.toString();
    }
}
