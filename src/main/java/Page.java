import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
    public void OpenPage(String url) {


        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
    }

}
