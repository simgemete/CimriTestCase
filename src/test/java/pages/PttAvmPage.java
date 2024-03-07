package pages;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.Methods;

public class PttAvmPage extends Methods {
    private static Logger logger = Logger.getLogger(PttAvmPage.class.getName());

    private final By iphoneProduct = By.xpath("//h1[@class='text-lg font-medium break-word']");
    private WebElement elementIphoneProduct;

    private final By productAmount = By.cssSelector(".text-eGreen-700");
    private WebElement elementProductAmount;
    public PttAvmPage(WebDriver driver) {
        super(driver);
    }

    public void shopControl(){
        setImplicitWaitTime(15);
        elementProductAmount = driver.findElement(productAmount);
        Assertions.assertTrue(elementProductAmount.isDisplayed(),"Urun goruntulenemedi!!");
        logger.info("Cimri magaza kontrolu testi başarıyla gerçekleşmiştir!!");
    }
}
