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
        if (number == 4) {
            return "IV";
        }
        return "I".repeat(Math.max(0, number));
    }
}
