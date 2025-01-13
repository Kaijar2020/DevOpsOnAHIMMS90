import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestUrl {

    WebDriver driver;

    @BeforeClass
    public void set_up(){

        driver = new ChromeDriver();

        driver.get("http://ahimms90.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void validity_test(){
        try{
            WebElement ahimms90 = driver.findElement(By.xpath("//h3[normalize-space()='AHIMMS90']"));
            WebElement umr_url = driver.findElement(By.xpath("//a[@href='http://www.universalmedicalrecord.com/']"));

            if (ahimms90.isDisplayed()){
                String text = ahimms90.getText();
                Assert.assertEquals(text,"AHIMMS90");
                Assert.assertTrue(umr_url.isDisplayed());
            }
        }
        catch (Exception e){
            System.out.println("sent email");
            throw new RuntimeException("There is a problem to redirect the website.Please, check the issue on server.");
        }

    }
    @AfterClass
    public void tear_down(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
