package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefiniations.hooks;

public class po1_login {
    private final By loginBtn = By.xpath("//button[text()='Login']");
    private final By email = By.id("email");
    private final By password = By.id("password");
    private final By signingButton = By.id("kc-login");
    private final By assertSuccessfulLogin = By.xpath("//*[@id=\"root\"]/div[3]/div[3]/div[3]/div/div[3]/div/div/div[1]/div/h1");
   // private By assertFailLogin = By.cssSelector("#kc-content-wrapper > div.alert.alert-error > span.kc-feedback-text");

    public WebElement loginPageLink(WebDriver driver) {
        return hooks.driver.findElement(loginBtn);
    }

    public WebElement addEmail(WebDriver driver) {
        return hooks.driver.findElement(email);
    }

    public WebElement addPassword(WebDriver driver) {
        return hooks.driver.findElement(password);
    }

    public WebElement clickSignIn(WebDriver driver) {
        return hooks.driver.findElement(signingButton);
    }
    public WebElement assertSuccessfulLogin(WebDriver driver){
        return hooks.driver.findElement(assertSuccessfulLogin);
    }


}

