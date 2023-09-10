import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Title is " +driver.getTitle());

        Actions builder = new Actions(driver);
        builder.click().pause(1000).build().perform();
        String frontTextLeftclick = driver.findElement(By.className("active")).getText();
         System.out.println("Front text on left click is " +frontTextLeftclick);

        builder.doubleClick().pause(1000).build().perform();
        String frontTextDoubleclick = driver.findElement(By.className("active")).getText();
        System.out.println("Number on Double click is " +frontTextDoubleclick);

        builder.contextClick().pause(1000).build().perform();
        String frontTextrightclick = driver.findElement(By.className("active")).getText();
        System.out.println("Front text on right click is " +frontTextrightclick);

         driver.quit();


    }
}
