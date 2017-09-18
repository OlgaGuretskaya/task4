import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by olga on 06.09.2017.
 */
public class CtgTest extends CalculatorTest {

    // Нет эксепшена на тангенс 0, 180 и 360 градусов
    @Test(expectedExceptions = NumberFormatException.class)
    public void testCtgNegative() throws Exception {
        calculator.ctg(180);
    }

    // В методе ctg вычисляется гипербалический тангенс(надеюсь это то что надо :)), а ctg = 1/tg
    @Parameters({"a", "ctgExpected"})
    @Test(groups={"tg/ctg"})
    public void testCtgPositive(double a, double ctgExpected) {
        double ctg = calculator.ctg(a);
        Assert.assertEquals(ctg, ctgExpected);
    }
}
