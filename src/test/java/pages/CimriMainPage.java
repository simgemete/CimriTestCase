package pages;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.Methods;

public class CimriMainPage extends Methods {

    private static Logger logger = Logger.getLogger(CimriMainPage.class);

    private final By search = By.xpath("//div[text()='Neyi en ucuza almak istersin?']");

    private final By btnsearch = By.id("search-input");
    private WebElement elementBtnSearch;

    private final By pttAvm = By.xpath("//div[@class='s1cegxbo-1 cACjAF']/div[1]//a[.='pttavm.com77.191,12 TL']");


    public CimriMainPage(WebDriver driver) {
        super(driver);
    }

    public void searchPhone(String product){
        waitForElement(search,10);
        click(search);
        waitForElement(btnsearch,10);
        type(btnsearch,product);
        elementBtnSearch = driver.findElement(btnsearch);
        Methods.pressEnterKey(driver, elementBtnSearch);
        setImplicitWaitTime(10);
        scrollToElement(pttAvm);
        setImplicitWaitTime(10);
        click(pttAvm);

    }

}
