package daniel.flynn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestive {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/dfflynn/IdeaProjects/Selenium/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.thameslinkrailway.com");

        WebElement leaveFromGoTo = driver.findElement(By.xpath("//input[@id='BookTicketsForm_2_Origin_0']"));
        leaveFromGoTo.sendKeys("Bedford");
        driver.findElement(By.cssSelector("input[id*='OpenReturn']")).isSelected();
        System.out.println(driver.findElement(By.cssSelector("input[id*='OpenReturn']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='OpenReturn']")).isSelected();
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='OpenReturn']")).isSelected());
        driver.close();



    }




}
