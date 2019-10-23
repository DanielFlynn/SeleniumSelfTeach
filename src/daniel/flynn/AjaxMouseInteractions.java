package daniel.flynn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class AjaxMouseInteractions {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/dfflynn/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk");
        Actions a =  new Actions(driver);
        WebElement move = (driver.findElement(By.cssSelector("a[id='nav-link-accountList']")));
        a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")))
                .click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        a.moveToElement(move).build().perform();
        Set<String>ids=driver.getWindowHandles();
        Iterator<String> it= ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);


    }
}
