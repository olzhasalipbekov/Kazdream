  package bin.testcases;

import bin.base.TestBase;
//import bin.pages.HomePage;
import bin.pages.GooglePage;
import bin.pages.OraclePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchTest extends TestBase{
    GooglePage googlePage;
    OraclePage oraclePage;
    public GoogleSearchTest(){ super();
    }
    @BeforeTest
    public void setUp(){
        initialization();   //инициализация драйвера
    googlePage = new GooglePage();
    oraclePage = new OraclePage();
    }
    @Test(priority = 1)
    public void testCase1() {
        googlePage.requestJava();
        oraclePage.checkResultPageUrl();
        oraclePage.clickOnVersion();
        oraclePage.checkAlert();
        oraclePage.clickAgreeBtn();
        oraclePage.clickOnVersion();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oraclePage.checkLoginPageUrl();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
