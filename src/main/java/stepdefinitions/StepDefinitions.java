package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojo.Root;

public class StepDefinitions {

    private static Response response;
    private static final RequestSpecification httpsRequest = RestAssured.given().contentType(ContentType.JSON);

    @When("User performs a GET call on the API {string}")
    public void userPerformsAGETCallOnTheAPI(String baseURI) {
        response = httpsRequest.queryParam("catalogue", "false").
        request(Method.GET, baseURI);
    }

    @Then("User verifies the name as {string}")
    public void userVerifiesTheNameAs(String expectedName) {
        Root root = response.getBody().as(Root.class);
        String actualName = root.name;
        Assert.assertEquals(expectedName, actualName);
    }

    @And("The CanRelist is {string}")
    public void userVerifiesThatCanRelistIs(String expectedCanReListValue) {
        Root root = response.getBody().as(Root.class);
        Boolean actualCanReListValue = root.canRelist;
        Assert.assertEquals(Boolean.parseBoolean(expectedCanReListValue), actualCanReListValue);
    }

    @And("The promotions element with name Gallery has a description {string}")
    public void thePromotionsElementWithNameAsHasADescription(String expectedPromotionDescription) {
        Root root = response.getBody().as(Root.class);
        String actualPromotionDescription = root.promotions.get(1).description;
        Assert.assertEquals(expectedPromotionDescription, actualPromotionDescription);
    }



}
