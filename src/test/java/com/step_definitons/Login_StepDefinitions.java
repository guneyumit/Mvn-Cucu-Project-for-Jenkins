package com.step_definitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_StepDefinitions {

    @Given("user is on the wikipedia page")
    public void userIsOnTheWikipediaPage() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://wikipedia.org");
        String title = "Wikipedi";

        Assert.assertEquals("Page title NOT verified !!!", title, driver.getTitle());

        Thread.sleep(5000);

        driver.close();
    }
}
