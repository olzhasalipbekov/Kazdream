package bin.pages;
import bin.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GooglePage extends TestBase {
    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(name = "btnK")
    private WebElement searchBtn;

    @FindBy(xpath = "//*[text()='Java SE Development Kit 8']")
    private WebElement resultLink;

    public GooglePage() {
        PageFactory.initElements(driver, this);
    }

    public void requestJava() {
        searchField.sendKeys("java oracle");
        searchBtn.click();
        resultLink.click();
    }




}
