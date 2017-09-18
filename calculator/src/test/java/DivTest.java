import org.testng.annotations.Test;

/**
 * Created by olga on 04.09.2017.
 */
public class DivTest extends CalculatorTest {

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivLong() throws Exception {
        calculator.div(2, 0);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void testDivDouble() throws Exception {
        calculator.div(2.0, 0.0);
    }

}
