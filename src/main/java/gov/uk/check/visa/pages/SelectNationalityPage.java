package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SelectNationalityPage extends Utility {

    @CacheLookup
    @FindBy(id = "response")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectNationality(String nationality){
        Reporter.log("Select Nationality" +nationalityDropDownList.toString());
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
        CustomListeners.test.log(Status.PASS,"Select Nationality" +nationality);
    }

    public void clickNextStepButton(){
        Reporter.log("Click on next button or continue" +nextStepButton.toString());
        clickOnElement(nextStepButton);
        CustomListeners.test.log(Status.PASS,"Click on next button or continue");
    }
}
