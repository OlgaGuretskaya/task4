import org.testng.annotations.Test;

/**
 * Created by olga on 06.09.2017.
 */
public class SqrtTest extends CalculatorTest {

    // Ошибка в реализации метода - корень вычисляется из модуля числа
    @Test(expectedExceptions = NumberFormatException.class)
    public void testSqrtDouble() throws Exception {
        calculator.sqrt(-4);
    }

  }
