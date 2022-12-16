package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement yesOrNo;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    //(Note: Use switch statement for select immigration status)
    public void selectImmigrationStatus(String status){
        Reporter.log("Select immigration status " + yesOrNo.toString());
        CustomListeners.test.log(Status.PASS, "Select immigration status");
    }

    public void clickNextStepButton(){
        Reporter.log("Click on continue " + nextStepButton.toString());
        clickOnElement(nextStepButton);
        CustomListeners.test.log(Status.PASS, "Click on continue");
        }
}
