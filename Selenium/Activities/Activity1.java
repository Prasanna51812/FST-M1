import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // activity2
        driver.get("https://v1.training-support.net");

        System.out.println("Title is " +driver.getTitle());
        driver.findElement(By.id("about-link")).click();
        System.out.println("New Title is " +driver.getTitle());

        driver.quit();


    }
}
