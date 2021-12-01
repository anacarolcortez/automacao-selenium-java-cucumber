package tricentis.stepsDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tricentis.pages.SendQuotePage;

import java.util.List;

public class SendQuoteSteps {

    SendQuotePage sendQuotePage = new SendQuotePage();

    @And("the user is redirected to the Quote Form")
    public void theUserIsRedirectedToTheQuoteForm() {
        sendQuotePage.validateSendQuoteTitle();
    }

    @And("the user submits Quote Form correctly")
    public void theUserSubmitsQuoteFormCorrectly(DataTable table) {
        List<String> data = table.column(1);
        sendQuotePage.fillEmailField(data.get(0));
        sendQuotePage.fillUserNameField(data.get(1));
        sendQuotePage.fillpassWordField(data.get(2));
        sendQuotePage.fillConfirmPassWordField(data.get(2));
    }

    @When("the user presses the Send button in the Quote Form")
    public void theUserPressesTheSendButtonInTheQuoteForm() {
        sendQuotePage.clickSendButton();
    }

    @And("waits for a Loading dialog to close")
    public void waitsForALoadingDialogToClose() {
        System.out.println("Loading");
    }

    @Then("the message {string} is displayed")
    public void theMessageIsDisplayed(String msg) {
        sendQuotePage.validateSucessMessage(msg);
    }

    @And("the user presses the OK button")
    public void theUserPressesTheOKButton() {
        sendQuotePage.clickOKButton();
    }



}
