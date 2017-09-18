import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by olga on 07.09.2017.
 */
public class IsNegativeTest extends CalculatorTest {

    @Test
    public void isNegative(){
        boolean isNegative = calculator.isNegative(-5);
        Assert.assertEquals(isNegative, true,"-5 should be negative");
    }
}
