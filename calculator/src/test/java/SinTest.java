import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by olga on 07.09.2017.
 */
public class SinTest extends CalculatorTest {

    @Parameters ({"a", "sinExpected"})
    @Test(groups={"sin/cos"})
    public void testCos(double a, double sinExpected) {
        double sin = calculator.sin(a);
        Assert.assertEquals(sin, sinExpected,"sin 180 should be 0.0");
    }
}
