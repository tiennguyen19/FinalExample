package nnt.exam.bai3.steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nnt.exam.bai3.Account;
import org.junit.jupiter.api.Assertions;

public class AccountSteps {
    private Account accountA, accountB, tmpAccount;

    @Given("create user A with {string} and {string} and create user B with {string} and {string}")
    public void createUserAWithAndAndCreateUserBWith(String idA, String userA, String idB, String userB) {
        accountA = new Account(idA, userA);
        accountB = new Account(idB, userB);
    }

    @And("user A: credit {int} USD")
    public void userACreditUSD(int amount) {
        accountA.credit(amount);
    }

    @And("user B: credit {int} USD")
    public void userBCreditUSD(int amount) {
        accountB.credit(amount);
    }

    @When("user A debit {int} USD")
    public void userADebitUSD(int amount) {
        accountA.debit(amount);
    }

    @And("user B transfer {int} USD to userA")
    public void userBTransferUSDToUserA(int amount) {
        accountB.transferTo(accountA, amount);
    }

    @Then("check balance user A")
    public void checkBalanceUserA() {
        tmpAccount = accountA;
    }

    @And("the balance is {int} USD")
    public void theBalanceIsUSD(int expected) {
        Assertions.assertEquals(expected, tmpAccount.getBalance());
    }

    @Then("check balance user B")
    public void checkBalanceUserB() {
        tmpAccount = accountB;
    }

    @Then("the balance is not enough")
    public void theBalanceIsNotEnough() {
        Assertions.assertEquals(200, accountA.getBalance());
    }
}
