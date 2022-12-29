package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountActivity_StepDefs {

    AccountActivity accountActivity = new AccountActivity();

    @Then("The default option in the Account menu should be {string}")
    public void the_default_option_in_the_account_menu_should_be(String sortType) {
        accountActivity.sortBtn_mtd(sortType);

    }
    @When("The account menu should also contain the following {string}")
    public void the_account_menu_should_also_contain_the_following(String string) {

    }
    @Then("The user should be able to see {string} with {int}")
    public void the_user_should_be_able_to_see_with(String string, Integer int1) {

    }

    @And("The user selects the {string} menu")
    public void theUserSelectsTheMen(String accountName) {
        accountActivity.menuSelectName_mtd(accountName);
    }
}
