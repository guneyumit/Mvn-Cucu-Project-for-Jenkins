package com.step_definitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Login_StepDefinitions {

    @Given("user is on the wikipedia page")
    public void userIsOnTheWikipediaPage() throws InterruptedException, MalformedURLException {
        WebDriver driver;
/*
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        //options.addArguments("--headless=new");
        //options.addArguments("headless");
        options.addArguments("--disable-logging");
        options.addArguments("--output=/home/james/chrome.logs");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--usr-data-dir=/home/james/chrome_data.logs");
        options.addArguments("--disable-logging");
        //options.setCapability("browserVersion", "119.0.6045.105");


        driver = new ChromeDriver(options);


 */
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserVersion", "119.0.6045.105");
        chromeOptions.setCapability("platformName", "Linux");
        driver = new RemoteWebDriver(new URL("https://wikipedia.org"), chromeOptions);

        driver.get("https://wikipedia.org");

        String title = "Wikipedia";
        Assert.assertEquals("Page title NOT verified !!!", title, driver.getTitle());

        Thread.sleep(3000);

        driver.close();
    }
}
