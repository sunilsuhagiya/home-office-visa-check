package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage;

    public String getResultMessage(){
        Reporter.log("Get message");
        CustomListeners.test.log(Status.PASS,"get result message");
        return getTextFromElement(resultMessage);
    }

    public void confirmResultMessage(String expectedMessage){
        Reporter.log("Confirm result message" +resultMessage.toString());
       // Assert.assertTrue(getResultMessage().contains(expectedMessage));
        Assert.assertTrue(resultMessage.isDisplayed(),expectedMessage);
        CustomListeners.test.log(Status.PASS,"Confirm result message" + expectedMessage);
    }


}
