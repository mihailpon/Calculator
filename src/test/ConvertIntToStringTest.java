package test;

import calculator.ConvertIntToString;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertIntToStringTest {
    @Test
    public void whenConvertOneHundred() {
        int num = 100;
        assertThat(new ConvertIntToString(num).ConvertToString(), is("C"));
    }

    @Test
    public void whenConvertThreeHundred() {
        int num = 300;
        assertThat(new ConvertIntToString(num).ConvertToString(), is("CCC"));
    }

    @Test
    public void whenConvertTen() {
        int num = 10;
        assertThat(new ConvertIntToString(num).ConvertToString(), is("X"));
    }

    @Test
    public void whenConvertSeveralTen() {
        int num = 20;
        assertThat(new ConvertIntToString(num).ConvertToString(), is("XX"));
    }

    @Test
    public void whenConvertNineteen() {
        int num = 90;
        assertThat(new ConvertIntToString(num).ConvertToString(), is("XC"));
    }

    @Test
    public void whenConvertSixteen() {
        int num = 60;
        assertThat(new ConvertIntToString(num).ConvertToString(), is("LX"));
    }

    @Test
    public void whenConvertFourteen() {
        int num = 40;
        assertThat(new ConvertIntToString(num).ConvertToString(), is("XL"));
    }

    @Test
    public void whenConvertNumberWithNine() {
        int num = 19;
        assertThat(new ConvertIntToString(num).ConvertToString(), is("XIX"));
    }

    @Test
    public void whenConvertNumberWithFive() {
        int num = 15;
        assertThat(new ConvertIntToString(num).ConvertToString(), is("XV"));
    }

    @Test
    public void whenConvertNumberWithFour() {
        int num = 44;
        assertThat(new ConvertIntToString(num).ConvertToString(), is("XLIV"));
    }

    @Test
    public void whenMustBeOneInTheNumber() {
        int num = 6;
        assertThat(new ConvertIntToString(num).ConvertToString(), is("VI"));
    }



}