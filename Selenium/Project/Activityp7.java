import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Activityp7 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();

        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.id("moduleTab_9_Leads")).click();



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

        driver.findElement(By.xpath("//span[@title='Additional Details']//parent::span[@id='adspan_6af2edb0-bc40-46d1-7837-5fdc647a1061']")).click();

        driver.quit();


    }
}
