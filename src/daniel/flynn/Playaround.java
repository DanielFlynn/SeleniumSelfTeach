package daniel.flynn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Playaround {

    public static void main(String[] args) {

        String travelFrom = "Bedford";
        String destination = "City Thameslink";

        System.setProperty("webdriver.chrome.driver", "/Users/dfflynn/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ticket.thameslinkrailway.com/search");

        driver.findElement(By.xpath("//a[contains(@href, '/search/season')]")).click();

        driver.findElement(By.name("origin")).sendKeys(travelFrom);
        driver.findElement(By.name("origin")).sendKeys(Keys.ENTER);

        driver.findElement(By.name("destination")).sendKeys(destination);
        driver.findElement(By.name("destination")).sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector("radio-inline:nth-child(1) > span:nth-child(2)")).click();

        driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();




    }
}
