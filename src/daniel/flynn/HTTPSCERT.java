package daniel.flynn;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class HTTPSCERT {

    public static void main(String[] args) throws IOException {

        DesiredCapabilities ch = DesiredCapabilities.chrome();
        ch.acceptInsecureCerts();

        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        ChromeOptions cO = new ChromeOptions();
        cO.merge(ch);

        System.setProperty("webdriver.chrome.driver", "/Users/dfflynn/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver(cO);


        driver.get("https://www.bbc.co.uk");
        driver.manage().window().maximize();

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot, new File ("/Users/dfflynn/Desktop/screenshot.png"));


    }
}
