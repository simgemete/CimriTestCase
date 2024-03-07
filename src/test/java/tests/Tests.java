package tests;

import data.ExcelReader;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.CimriMainPage;
import pages.PttAvmPage;

public class Tests extends BasePage {

    ExcelReader excelReader = new ExcelReader("C:\\Users\\simge\\IdeaProjects\\CimriTestCase\\src\\test\\resources\\data\\cimriData.xlsx");

    @Test
    void CimriCase()  {
        CimriMainPage cimriMainPage = new CimriMainPage(driver);
        PttAvmPage pttAvmPage = new PttAvmPage(driver);
        cimriMainPage.searchPhone(excelReader.readExcelFile("1.0").get("product"));
        pttAvmPage.shopControl();
    }

}
