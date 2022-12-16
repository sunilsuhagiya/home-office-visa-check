package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DurationOfStayPage extends Utility {
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;


    public void selectLengthOfStay(String moreOrLess) {
        Reporter.log("Select length of stay" + nextStepButton .toString());
        switch (moreOrLess) {
            case "longer than 6 months":
                clickOnElement(moreThanSixMonths);
                break;
            case "6 months or less":
                clickOnElement(lessThanSixMonths);
                break;
        }
    }

    public void clickNextStepButton() {
        Reporter.log("Click on next button" + nextStepButton .toString());
        clickOnElement(nextStepButton);
        CustomListeners.test.log(Status.PASS,"Click on next button");
    }
}
