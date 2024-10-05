package framework;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.IOException;

public class Report {
    public static ExtentSparkReporter reporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void setExtent() {
        String reportPath = Config.getProperty("reportPath");
        try {
            reporter = new ExtentSparkReporter(reportPath + "TestExecutionReport" + ".html");
            reporter.config().setDocumentTitle("UI Test results");
            reporter.loadXMLConfig(Config.getProperty("reportConfigPath"));
            extent = new ExtentReports();
            extent.attachReporter(reporter);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void endReport() {
        extent.flush();
    }
}
