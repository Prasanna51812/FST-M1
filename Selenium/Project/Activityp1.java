import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activityp1 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");
        // print title
        System.out.println( "Title is " +driver.getTitle());
        String ExpectedTitle = driver.getTitle();
        //verify title
        if ( ExpectedTitle.equals("SuiteCRM")) {
            System.out.println("Title Matched");
        }
        else{
            System.out.println("Title is not matching");
        }

        driver.quit();
    }

}
