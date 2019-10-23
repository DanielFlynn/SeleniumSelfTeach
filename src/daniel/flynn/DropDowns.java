package daniel.flynn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/dfflynn/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.thameslinkrailway.com/");
        Select selecting = new Select(driver.findElement(By.xpath("//select[@id='BookTicketsForm_2_Adults_0']")));
        selecting.selectByValue("8");
        selecting.selectByIndex(4);
        driver.findElement(By.xpath("//a[@class='c-nav__link t-nav__link c-nav__link--sub'][contains(text(),'Tickets')]]")).click();




    }
}
