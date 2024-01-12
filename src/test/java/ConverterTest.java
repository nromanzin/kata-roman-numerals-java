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

    @Test
    public void shouldReturnIVWhenGiven4() {
        assertEquals("IV", converter.toRoman(4));
    }

    @Test
    public void shouldReturnVWhenGiven5() {
        assertEquals("V", converter.toRoman(5));
    }

    @Test
    public void shouldReturnVIWhenGiven6() {
        assertEquals("VI", converter.toRoman(6));
    }

    @Test
    public void shouldReturnVIIWhenGiven7() {
        assertEquals("VII", converter.toRoman(7));
    }

    @Test
    public void shouldReturnVIIIWhenGiven8() {
        assertEquals("VIII", converter.toRoman(8));
    }

    @Test
    public void shouldReturnIXWhenGiven9() {
        assertEquals("IX", converter.toRoman(9));
    }

    @Test
    public void shouldReturnXWhenGiven10() {
        assertEquals("X", converter.toRoman(10));
    }
}

