import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by olga on 07.09.2017.
 */
public class CosTest extends CalculatorTest {

    // В методе cos() вычисляется sin
    @Parameters({"a", "cosExpected"})
    @Test(groups={"sin/cos"})
    public void testCos(double a, double cosExpected){
        double cos = calculator.cos(a);
        Assert.assertEquals(cos, cosExpected);
    }
}
