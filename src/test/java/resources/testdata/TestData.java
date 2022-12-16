package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester", "Harrow","up to 5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Retail Sales", "London","up to 1 mile","3000","25000","Per annum","Part Time","Part Time Retail Sales jobs in London"},
                {"Nursing", "Manchester","up to 2 miles","3000","25000","Per annum","Permanent","Permanent Nursing jobs in Manchester"},
                {"Nursing", "Norfolk","up to 5 miles","3000","25000","Per annum","Permanent","Permanent Nursing jobs in Norfolk"},
                {"Electrician", "Scotland","up to 2 miles","3000","25000","Per annum","Permanent","Permanent Electrician jobs in Scotland"},
                {"Plumber", "Great Britain","up to 2 miles","3000","25000","Per annum","Permanent","Permanent Plumber jobs in Great Britain"},
        };
        return data;
    }
}
