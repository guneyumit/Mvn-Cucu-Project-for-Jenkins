package com.step_definitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_StepDefinitions {
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("uuser enters librarian password");

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }
    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("user enters student username");

    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters student password");

    }


    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");

    }

    @And("user enter admin password")
    public void userEnterAdminPassword() {
        System.out.println("user enter admin password");

    }


    @Given("user is on the page")
    public void userIsOnThePage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://wikipedia.org");
        String title = "Wikipedia";
        Assert.assertEquals(title, driver.getTitle());
        Thread.sleep(5000);

        driver.close();
    }
}
