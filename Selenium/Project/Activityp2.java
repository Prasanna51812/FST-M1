import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activityp2 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
        // print title
        System.out.println("Title is " + driver.getTitle());
        // get header image
       String headerurl = driver.findElement(By.xpath("//img[@alt='SuiteCRM']")).getAttribute("src");
       System.out.println("Header image URL is " +headerurl);

       driver.quit();
    }
}
