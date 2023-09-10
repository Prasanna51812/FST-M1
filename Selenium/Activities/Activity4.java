import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // activity2
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Title is " +driver.getTitle());

        String first = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("text is " +first );
        String second  = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
        System.out.println("color is" +second );
        String third = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
        System.out.println("class is" +third );
        String fourth = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
        System.out.println("class is" +fourth );
        driver.quit();


    }
}

