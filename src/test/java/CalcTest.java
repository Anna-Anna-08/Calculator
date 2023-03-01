
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalcTest {

    int a = 2;
    int b = 2;

    @Test
    public void testCalculatorAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        assertEquals(4, result);
        int result2 = calculator.add(2, 4);
        assertEquals(6, result2);
    }

}

