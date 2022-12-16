package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WorkTypePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//label[@class='gem-c-label govuk-label govuk-radios__label']")
    WebElement selectJobtypeList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectJobType(String job){
        Reporter.log("Select Job Type " + selectJobtypeList.toString());
        clickOnElement(selectJobtypeList);
        CustomListeners.test.log(Status.PASS, "Select Job Type"+job);
    }

    public void clickNextStepButton(){
        Reporter.log("Click on next" + nextStepButton.toString());
        clickOnElement(nextStepButton);
        CustomListeners.test.log(Status.PASS, "click on next");
    }
}
