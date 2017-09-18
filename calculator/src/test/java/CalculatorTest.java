import org.testng.annotations.*;

/**
 * Created by olga on 04.09.2017.
 */
public class CalculatorTest {

    public Calculator calculator;


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }

    @BeforeClass
     public void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeMethod (groups = "config")
    public void beforeMethod() {
        calculator = new Calculator();
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }


}