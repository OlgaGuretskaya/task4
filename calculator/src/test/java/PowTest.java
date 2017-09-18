import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by olga on 06.09.2017.
 */
public class PowTest extends CalculatorTest {

    @Test
    public void testPowDouble() {
        double pow = calculator.pow(5, -4);
        Assert.assertEquals(pow, 0.0016,"5^(-4) should be 0.0016");
    }
}
