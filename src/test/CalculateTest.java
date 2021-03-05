package test;

import calculator.Calculate;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void whenSumCalculate() throws Exception {
        Calculate calc = new Calculate();
        assertThat(calc.calculate("1", "2", "+"), is("3"));
    }

    @Test
    public void whenMinusCalculate() throws Exception {
        Calculate calc = new Calculate();
        assertThat(calc.calculate("5", "3", "-"), is("2"));
    }

    @Test
    public void whenMultipleCalculate() throws Exception {
        Calculate calc = new Calculate();
        assertThat(calc.calculate("3", "6", "*"), is("18"));
    }

    @Test
    public void whenDivisionCalculate() throws Exception {
        Calculate calc = new Calculate();
        assertThat(calc.calculate("10", "5", "/"), is("2"));
    }

    @Test (expected = Exception.class)
    public void whenNotFromOneToTen() throws Exception {
        Calculate calc = new Calculate();
        calc.calculate("15", "5", "/");
    }

    @Test (expected = Exception.class)
    public void whenNIncorrectOperation() throws Exception {
        Calculate calc = new Calculate();
        calc.calculate("5", "5", "6");
    }

}