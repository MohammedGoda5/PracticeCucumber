package stepDefiniations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class hooks {
    public static WebDriver driver;

    @Before
    public void setup() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.get("https://vconnct.me/");
        Thread.sleep(400);
    }
    @After
    public void close() {

    }

}
