package framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil {

    public static WebDriver setBrowser(String browser)  {
        WebDriver webDr = null;
        switch (browser)  {
            case "Chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("disable-popup-blocking");
                chromeOptions.addArguments("disable-infobars");
                chromeOptions. addArguments("--disable-extensions");
                chromeOptions.addArguments("--remote-allow-origins=*");
                WebDriverManager.chromedriver().setup();
                webDr = new ChromeDriver(chromeOptions);
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                webDr = new EdgeDriver();
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                webDr = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser specified in Config file: " + browser);
                break;
        }
        return webDr;
    }

}
