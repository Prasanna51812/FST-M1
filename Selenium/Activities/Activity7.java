import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {


    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        Actions builder  = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("Title is " + driver.getTitle());
         WebElement ball = driver.findElement(By.id("draggable"));
         WebElement dropzone1 = driver.findElement(By.id("droppable"));
         builder.clickAndHold(ball).moveToElement(dropzone1).pause(3000).release().build().perform();


        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        builder.dragAndDrop(ball,dropzone2).build().perform();
        driver.quit();

    }

}