import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {
    public void OpenPage(String url) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.findElementById("lst-ib").sendKeys("some string");
        driver.findElementById("lst-ib").sendKeys(Keys.RETURN);

    }

}
