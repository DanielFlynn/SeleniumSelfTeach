package daniel.flynn;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class remotetest {

    public static void main(String[] args) throws MalformedURLException {
// TODO Auto-generated method stub
//Automated- chrome,firefox,ie,safari

        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.MAC);
//dc.se

//Webdriver driver=new ChromeDriver();
        WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),dc);
        driver.get("http://rediff.com");



//
    }

}

