import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Title is " + driver.getTitle());
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        driver.quit();

        // activity1

        //driver.get("https://v1.training-support.net");

       // System.out.println("Title is " +driver.getTitle());
       // driver.findElement(By.xpath("//a[@id='about-link']")).click();
       // System.out.println("New Title is " +driver.getTitle());

       // driver.quit();


    }
}
