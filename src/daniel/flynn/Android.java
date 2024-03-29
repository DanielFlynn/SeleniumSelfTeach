package daniel.flynn;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Android {

    public static void main(String[] args) throws MalformedURLException {


        File f = new File("Users/dfflynn/Selenium//src/daniel/flynn/ApiDemos-debug.apk");
        //File fs = new File(f, "ApiDemos-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DanielApp");
        cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());


        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

}