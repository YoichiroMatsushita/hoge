package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void multiplyで乗算結果が取得できる() {
        Calculator calc = new Calculator();
        int ecpected = 12;
        int actual = calc.multiply(3, 4);
        assertThat(actual, is(ecpected));
    }

    @Test
    public void devideで3と2の除算結果が取得できる(){
        Calculator calc = new Calculator();
        float expected = 1.5f;
        float actual = calc.divide(3, 2);
        assertThat(actual, is(expected));
    }
    @Test
    public void testname() throws Exception {

    }

}
