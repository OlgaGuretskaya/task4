import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;

/**
 * Created by olga on 08.09.2017.
 */
public class Runner {
    public static void main(String[] args){
        TestNG testNG = new TestNG();
        //testNG.addListener(new TestListenerAdapter());
        testNG.addListener(new MyCustomListener());

        final XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setName("Calculator suite");
        xmlSuite.setSuiteFiles(
                new ArrayList<String>(){{
                    add("./src/test/resources/suites/calculator.xml");
                    add("./src/test/resources/suites/parallel.xml");
                }}
        );

        testNG.setXmlSuites(new ArrayList<XmlSuite>(){{

            add(xmlSuite);

        }});
        testNG.run();
    }
}
