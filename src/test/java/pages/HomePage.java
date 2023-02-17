package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchResult() {
        return searchResult;
    }

    @FindBy(id="twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(xpath="//span[@class='a-color-state a-text-bold']")
    WebElement searchResult;
}
