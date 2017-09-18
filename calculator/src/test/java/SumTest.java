import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by olga on 04.09.2017.
 */
public class SumTest extends CalculatorTest {

  //  @Parameters({"a", "b", "expected"})
    @Test (dataProvider = "dataForSum", groups = "dataProvider")
    public void testSumLong(long a, long b, long expected) throws Exception{
           long sum = calculator.sum(a, b);
           Assert.assertEquals(sum, expected);
    }

    @DataProvider(name="dataForSum")
    public Object[][] dataForSum(){
        return new Object[][]{
                {-2, -4, -6},
                {-3, 3, 0},
                {6, 9, 15}
        };
    }

    //При создании метода не была учтена специфика работы с типом double (Actual:9.799999999999999)
    @Test
    public void testSumDouble() {
        double sum = calculator.sum(1.2, 8.6);
        Assert.assertEquals(sum, 9.8,"1.2+8.6 should be 9.8");
    }


}
