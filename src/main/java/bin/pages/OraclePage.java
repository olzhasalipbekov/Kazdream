package bin.pages;
import bin.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OraclePage extends TestBase {
    @FindBy(name = "jdk-8u241-oth-JPRXXXjdk-8u241-windows-x64.exe")
    private WebElement downloadBtn;

    @FindBy(id="agreementjdk-8u241-oth-JPR-a")
    private WebElement agreeBtn;

    public OraclePage() {
        PageFactory.initElements(driver, this);
    }

    public void checkLoginPageUrl(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://login.oracle.com/mysso/signon.jsp" );
    }
    public void checkAlert(){
        driver.switchTo().alert().accept();
    }
    public void checkResultPageUrl(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https:" +
                "//www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html" );
    }

    public void clickOnVersion(){
        downloadBtn.click();
    }

    public void clickAgreeBtn(){
        agreeBtn.click();
    }
}
