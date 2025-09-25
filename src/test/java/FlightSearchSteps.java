import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightSearchSteps {
    @Given("I am on the Skyscanner flights page")
    public void iAmOnTheSkyscannerFlightsPage() {
    }

    @And("I have selected {string}")
    public void iHaveSelected(String arg0) {
    }

    @When("I set the origin to {string}")
    public void iSetTheOriginTo(String arg0) {
    }

    @And("I set the destination to {string}")
    public void iSetTheDestinationTo(String arg0) {
    }

    @And("I choose departure date {string} and return date {string}")
    public void iChooseDepartureDateAndReturnDate(String arg0, String arg1) {
    }

    @And("I set passengers to {int} adult")
    public void iSetPassengersToAdult(int arg0) {
    }

    @And("I start the search")
    public void iStartTheSearch() {
    }

    @Then("I should see a list of flight results")
    public void iShouldSeeAListOfFlightResults() {
    }
}
