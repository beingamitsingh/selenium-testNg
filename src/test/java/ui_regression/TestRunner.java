package ui_regression;

import framework.Config;
import framework.Report;
import framework.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestRunner {

    public static WebDriver webDriver;

    @BeforeSuite(alwaysRun = true)
    public static void setUp()  {
        new Config();

        Report.setExtent();
        webDriver = WebDriverUtil.setBrowser(Config.getProperty("browser"));
    }

    @AfterSuite
    public void tearDown() {
        Report.endReport();
    }
}