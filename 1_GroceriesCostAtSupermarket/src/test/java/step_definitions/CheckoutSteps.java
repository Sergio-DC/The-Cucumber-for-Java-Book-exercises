package step_definitions;


import implementation.Checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class CheckoutSteps {
    int bananaPrice = 0;
    Checkout checkout;

    @Given("the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) {
        bananaPrice = price;
    }

    @When("I checkout {int} {string}")
    public void iCheckout(Integer itemCount, String itemName) {
        // Write code here that turns the phrase above into concrete actions
        checkout = new Checkout();
        checkout.add(itemCount, bananaPrice);

    }

    @Then("the total price should be {int}c")
    public void theTotalPriceShouldBeC(int total) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(total, checkout.total());

    }
}
