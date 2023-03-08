import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test
    public void start(){
        wd = new ChromeDriver();
//        wd.get("https://google.com/");
        wd.navigate().to("https://google.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

//        wd.close();
        wd.quit();
    }
}
