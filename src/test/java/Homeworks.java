import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Homeworks {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        // by tag
        WebElement el1 = wd.findElement(By.tagName("h1"));
        WebElement el2 = wd.findElement(By.cssSelector("h1"));

        // by class
        WebElement el3 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el4 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el18 = wd.findElement(By.cssSelector(".active"));

        // by id
        WebElement el5 = wd.findElement(By.id("root"));
        WebElement el6 = wd.findElement(By.cssSelector("#root"));

        // by attribute
        WebElement el7 = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el19 = wd.findElement(By.cssSelector("[aria-current='page']"));
        WebElement el20 = wd.findElement(By.cssSelector("[name='email']"));

        // by name
        WebElement el8 = wd.findElement(By.name("email"));
        WebElement el9 = wd.findElement(By.name("password"));
        WebElement el10 = wd.findElement(By.cssSelector("[name='login']"));
        WebElement el11 = wd.findElement(By.cssSelector("[name='registration']"));

        // by linkText // by partial linkText
        WebElement el12 = wd.findElement(By.linkText("HOME"));
        WebElement el13 = wd.findElement(By.partialLinkText("OUT"));


        WebElement el14 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        // start
        WebElement el15 = wd.findElement(By.cssSelector("[placeholder ^= 'Pass']"));
        //end
        WebElement el16 = wd.findElement(By.cssSelector("[placeholder $= 'word']"));
        //contains
        WebElement el17 = wd.findElement(By.cssSelector("[placeholder *= 'ssw']"));
    }
}
