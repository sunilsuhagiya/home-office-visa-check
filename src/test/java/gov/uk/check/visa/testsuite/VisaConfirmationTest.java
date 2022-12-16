package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {

    StartPage startPage;
    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    WorkTypePage workTypePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        startPage = new StartPage();
        durationOfStayPage = new DurationOfStayPage();
        reasonForTravelPage = new ReasonForTravelPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        resultPage = new ResultPage();
        selectNationalityPage = new SelectNationalityPage();
        workTypePage = new WorkTypePage();
    }

    @Test(groups = {"smoke", "regression"})
    public void anAustralianCominToUKForTourism(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Tourism or visiting family and friends");
        reasonForTravelPage.clickNextStepButton();
        resultPage.getResultMessage();
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");
    }

    @Test(groups = {"sanity", "regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
        reasonForTravelPage.clickNextStepButton();
        durationOfStayPage.selectLengthOfStay("longer than 6 months");
        durationOfStayPage.clickNextStepButton();
        workTypePage.selectJobType("Health and care professional");
        workTypePage.clickNextStepButton();
        resultPage.confirmResultMessage("You need a visa to work in health and care");
    }

    @Test(groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
        reasonForTravelPage.clickNextStepButton();
        resultPage.confirmResultMessage("You may need a visa");
    }
}
