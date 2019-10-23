package daniel.flynn;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

    public static void main(String[] args) throws InterruptedException{

        String chrome = System.setProperty("webdriver.chrome.driver", "/Users/dfflynn/IdeaProjects/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

        WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        //int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
        int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

        int sum = 0;
        for(int i = 0; i<count-2; i++) {
            String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            int valueInteger = Integer.parseInt(value);
            sum = sum + valueInteger;//103
        }
//System.out.println(sum);

        String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int extrasValue=Integer.parseInt(Extras);
        int TotalSumValue = sum + extrasValue;
        System.out.println(TotalSumValue);


        String ActualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        int ActualTotalValue = Integer.parseInt(ActualTotal);
        if (ActualTotalValue == TotalSumValue) {
            System.out.println("Count Matches");
        } else {
            System.out.println("count fails");
        }
    }

}

