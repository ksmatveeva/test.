import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testPlus() {
        Calculator calc = Calculator.instance.get();
        int result = calc.plus.apply(3, 5);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testMinus() {
        Calculator calc = Calculator.instance.get();
        int result = calc.minus.apply(10, 3);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void testDivide() {
        Calculator calc = Calculator.instance.get();
        int result = calc.divide.apply(15, 3);
        Assertions.assertEquals(5, result);
    }




}
