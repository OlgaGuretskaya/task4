import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by olga on 04.09.2017.
 */
public class MultTest extends CalculatorTest {

    @Test
    public void testMultLong() {
        long mult = calculator.mult(2,3);
        Assert.assertEquals(mult,6,"2*3 should be 6");
    }

    //При создании метода не была учтена специфика работы с типом double (Actual:9.799999999999999)
    @Test
    public void testMultDouble() {
        double mult = calculator.mult(1.2, 8.6);
        Assert.assertEquals(mult, 10.3,"1.2*8.6 should be 10.3");
    }
}
