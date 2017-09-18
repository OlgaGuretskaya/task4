import org.testng.ISuite;
import org.testng.ISuiteListener;

/**
 * Created by olga on 08.09.2017.
 */
public class MyCustomListener implements  ISuiteListener{
    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite started: " + suite.getName());
     }

     @Override
    public void onFinish(ISuite suite){
      //   System.out.println("Suite finished: " + suite.getName());
    }

}
