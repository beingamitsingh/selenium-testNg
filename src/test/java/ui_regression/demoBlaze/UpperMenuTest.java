package ui_regression.demoBlaze;

import framework.Config;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui_regression.TestRunner;

public class UpperMenuTest extends TestRunner {

    @BeforeClass
    public void beforeClass() {
        TestRunner.webDriver.get(Config.getProperty("appURL"));
        TestRunner.webDriver.manage().window().maximize();
    }

    @Test
    public void contactOptionTest() {
        System.out.println("you are here.");
    }
}
