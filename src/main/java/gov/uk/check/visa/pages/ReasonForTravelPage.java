package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//label[@class='gem-c-label govuk-label govuk-radios__label']")
    WebElement reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectReasonForVisit(String reason){
        Reporter.log("Select immigration status " + reasonForVisitList.toString());
        List<WebElement> reasonForVisitList = driver.findElements(By.xpath("//label[@class='gem-c-label govuk-label govuk-radios__label']"));
        for (WebElement options : reasonForVisitList) {
            if (options.getText().equals(reason)) {
                options.click();
                System.out.println(options.getText());
            }
        }
    }

    public void clickNextStepButton(){
        Reporter.log("Click on continue" +nextStepButton.toString());
        clickOnElement(nextStepButton);
        CustomListeners.test.log(Status.PASS,"Click on continue");
    }
}
