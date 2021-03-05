package test;

import calculator.ConvertStringToInt;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ConvertStringToIntTest {

    @Test
    public void whenConvertTen() throws Exception {
        String num = "X";
        assertThat(ConvertStringToInt.toArabic(num), is(10));
    }

    @Test
    public void whenConvertNine() throws Exception {
        String num = "IX";
        assertThat(ConvertStringToInt.toArabic(num), is(9));
    }

    @Test
    public void whenConvertEight() throws Exception {
        String num = "VIII";
        assertThat(ConvertStringToInt.toArabic(num), is(8));
    }

    @Test (expected = Exception.class)
    public void whenIncorrect() throws Exception {
        String num = "VIIII";
        assertThat(ConvertStringToInt.toArabic(num), is(8));
    }
}