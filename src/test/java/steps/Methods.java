package steps;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;



public class Methods {
    public WebDriver driver;

    public Methods(WebDriver driver){
        this.driver=driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator, String text){
        find(locator).sendKeys(text);
    }

    public void waitForElement(By locator, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void setImplicitWaitTime(int times){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(times));
    }

    public void scrollToElement(By locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",find(locator));
    }

    public static void pressEnterKey(WebDriver driver, WebElement element) {
        element.sendKeys(Keys.ENTER);
    }

    public void windowHandle(String window){
        Set<String> winSet = driver.getWindowHandles();
        for (String each:winSet){
            if(!each.equalsIgnoreCase(window)){
                driver.switchTo().window(each);
            }
        }
    }

}
