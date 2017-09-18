import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by olga on 07.09.2017.
 */
public class IsPositiveTest extends CalculatorTest {

    @Test
    public void isPositive() {
        boolean isPositive = calculator.isPositive(-5);
        Assert.assertEquals(isPositive, false,"-5 should be negative");
    }

}
