package daniel.flynn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {
        String firstName = "Bob";
        String lastName = "Jones";
        String emailAddress = "BobJones@testemail.com";


        System.setProperty("webdriver.chrome.driver", "/Users/dfflynn/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");

        //driver.findElement(By.id("email")).sendKeys("hello");
        //driver.findElement(By.id("pass")).sendKeys("sdjfhewijfewojdfh");
        //driver.findElement(By.xpath("//input[@type= 'email']")).sendKeys("asfhasofjahsf");
        //driver.findElement(By.xpath("//input[@type= 'password']")).sendKeys("saojfhasoiufash");
        //driver.findElement(By.xpath("//input[@value= 'Log In']")).submit();
        //driver.findElement(By.linkText("Forgotten account?")).click();driver.findElement(By.xpath("//input[@value= 'Log In']")).submit();
        driver.findElement(By.name("firstname")).sendKeys(firstName);
        driver.findElement(By.name("lastname")).sendKeys(lastName);
        driver.findElement(By.name("reg_email__")).sendKeys(emailAddress);

//        driver.close();


    }
}
