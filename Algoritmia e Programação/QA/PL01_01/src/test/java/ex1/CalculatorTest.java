import org.example.ex1.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
    @Test
    public void testDivide() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract(){
        assertEquals(2, calculator.subtract(10, 8), "Resultado número positivo");
        assertEquals(-2, calculator.subtract(8, 10), "Resultado número negativo");
        assertEquals(0, calculator.subtract(8, 8), "Resultado número negativo");
    }

    @Test
    public void testMultiply(){
        assertEquals(4, calculator.multiply(2,2), "Resultado número positivo");
        assertEquals(0, calculator.multiply(0,2), "Resultado é zero");;
        assertEquals(0, calculator.multiply(2,0), "Resultado é zero");;
    }
    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}