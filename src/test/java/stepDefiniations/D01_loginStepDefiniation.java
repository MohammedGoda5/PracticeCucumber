package stepDefiniations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.po1_login;


import static stepDefiniations.hooks.driver;

public class D01_loginStepDefiniation {
    po1_login PO1 = new po1_login();
    private final By loginBtn = By.xpath("//button[text()='Login']");
    @When("user open Vconnct website")
    public void openLoginPage(){
        WebElement element = hooks.driver.findElement(By.xpath("//button[text()='Login']"));
        ((JavascriptExecutor) hooks.driver).executeScript("arguments[0].click();", element);

        //PO1.loginPageLink(hooks.driver).click();
    }

    @Given("user add valid user email")
    public void addValidEmail() {
        PO1.addEmail(driver).sendKeys("odinabil972@gmail.com");
    }

    @And("user add valid password")
    public void addValidPassword() {
        PO1.addPassword(driver).sendKeys("123456Mm");
    }

    @And("user clicks on sign in button")
    public void clickOnSignOn() {
        PO1.clickSignIn(driver).click();
    }

    @Then("user is logged in to the vconnct")
    public void assertSuccessfulLogin() {
        PO1.assertSuccessfulLogin(driver).getText().equals("Welcome to the V.Connct Dashboard");
    }
}
