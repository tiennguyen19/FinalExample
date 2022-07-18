package nnt.exam.bai2.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nnt.exam.bai2.Converter;
import org.junit.jupiter.api.Assertions;

public class ConverterSteps {
    private Converter converter;
    private double input;
    private double resultActual;

    @Given("^a calculator$")
    public void aCalculator() {
        converter = new Converter();
    }

    @And("user input {double}")
    public void userInputInput(double input) {
        this.input = input;
    }


    @When("user click button F=>C")
    public void userClickButtonFC() {
        resultActual = converter.convertFtoC(input);
    }

    @Then("result is {double}")
    public void resultIsResult(double expected) {
        Assertions.assertTrue(Math.abs(expected - resultActual) < 0.001);
    }

    @When("user click button C=>F")
    public void userClickButtonCF() {
        resultActual = converter.convertCtoF(input);
    }
}
