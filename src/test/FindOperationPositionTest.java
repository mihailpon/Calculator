package test;

import calculator.FindOperationPosition;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FindOperationPositionTest {
    @Test
    public void whenOperationPosIsCorrect() throws Exception {
        assertThat(FindOperationPosition.operationPos("3+2"), is(1));
    }

    @Test
    public void whenOperationPosIsMissed() throws Exception {
        assertThat(FindOperationPosition.operationPos("32"), is(-1));
    }

    @Test (expected = Exception.class)
    public void whenOperationPosIsIncorrectly() throws Exception {
        FindOperationPosition.operationPos("+23");
    }

    @Test (expected = Exception.class)
    public void whenSeveralOperationPos() throws Exception {
        FindOperationPosition.operationPos("3+-5");
    }

}