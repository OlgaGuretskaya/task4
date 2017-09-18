import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by olga on 04.09.2017.
 */
public class SubTest extends CalculatorTest {

    @Test
    public void testSubLong() {
        long sub = calculator.sub(2, 3);
        Assert.assertEquals(sub, -1,"2-3 should be -1");
    }

    //При создании метода кроме Math.floor надо было специфицировать количество знаков после запятой
    @Test
    public void testSubDouble() {
        double sub = calculator.sub(1.2, 8.6);
        Assert.assertEquals(sub, -7.4,"1.2-8.6 should be -7.4");
    }
}
