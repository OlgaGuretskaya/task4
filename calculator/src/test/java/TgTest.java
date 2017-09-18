import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by olga on 06.09.2017.
 */
public class TgTest extends CalculatorTest {

    // Нет эксепшена на тангенс 90 и 270 градусов
    @Test(expectedExceptions = NumberFormatException.class)
    public void testTgNegative() throws Exception {
        calculator.tg(90);
    }

    // Любой тест будет проходить с актуальным результатом 1, т.к. в методе cos() вычисляетя sin
    @Parameters({"a", "tgExpected"})
    @Test(groups={"tg/ctg"}, dependsOnGroups = {"sin/cos"})
    public void testTgPositive(double a, double tgExpected){
        double tg = calculator.tg(a);
        Assert.assertEquals(tg, tgExpected,"tg 180 should be 0.0");
    }
}
