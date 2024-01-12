import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {
    private Converter converter;

    @BeforeEach
    public void init() {
        this.converter = new Converter();
    }

    @Test
    public void shouldReturnIWhenGiven1() {
        assertEquals("I", converter.toRoman(1));
    }

    @Test
    public void shouldReturnIIWhenGiven2() {
        assertEquals("II", converter.toRoman(2));
    }

    @Test
    public void shouldReturnIIIWhenGiven3() {
        assertEquals("III", converter.toRoman(3));
    }
}

