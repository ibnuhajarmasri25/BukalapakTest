package PageObject;

import configs.ElementInspect;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utility.Hooks;
import utility.TestData;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Homepage extends Hooks {

    private static TestData testData = new TestData();

    public void Homepage(WebDriver driver) {
        Hooks.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //    Mini Configuration
    public void WaitTimeOutLoad () {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void waitElement(By element) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
    public void waitPageload(By element){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public static void takeScreenshoot() {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("src/ScreenShoot/" + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void scrollPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
//    -------> Mini configuration <------------

    //getting Url
    public void MidtransPage(String url) {
        driver.get(url.replace("\"", ""));
        System.out.println("SuccessFully Opening Website : " + url);
        driver.manage().window().maximize();
        if (driver.findElement(searchType).isDisplayed()){
            takeScreenshoot();
        }
    }

    public void GotoMidtransPage() {
        MidtransPage(testData.getUrl());
    }

    //Calling Xpath On Element Inspect Class
    By LoginPage        = By.xpath(ElementInspect.xpathLoginPage);
    By OnLoginPage      = By.xpath(ElementInspect.xpathValidationLogin);
    By Username         = By.xpath(ElementInspect.xpathUsername);
    By Password         = By.xpath(ElementInspect.xpathPassword);
    By clickLogin       = By.xpath(ElementInspect.clickLogin);
    By searchType       = By.xpath(ElementInspect.searchType);
    By submitSearch     = By.xpath(ElementInspect.submitSearch);
    By searhResult      = By.xpath(ElementInspect.searchResult);
    By home             = By.xpath(ElementInspect.xpathHome);
    By clickListBarang  = By.xpath(ElementInspect.xpathClickBarang);
    By addToChart       = By.xpath(ElementInspect.xpathAddtoChart);
    By avatar           = By.xpath(ElementInspect.xpathAvatar);
    By logout           = By.xpath(ElementInspect.xpathLogout1);
    By Close            = By.xpath(ElementInspect.xpathclose);
    By RegistrationPage = By.xpath(ElementInspect.xpathRegistration);
    By fullname         = By.xpath(ElementInspect.xpathFullname);
    By inpNewEmail      = By.xpath(ElementInspect.xpathEmailNew);
    By alreadyEmail     = By.xpath(ElementInspect.getXpathValidAlreadyEmail);
    By MoveLoginTab       = By.xpath(ElementInspect.xpathLoginTab);
    By Next               = By.xpath(ElementInspect.xpathSubmitNext);
    By nextReg            = By.xpath(ElementInspect.xpathNext);
    By sendCode           = By.xpath(ElementInspect.sendCode);


    //excecute for step definition
// create Account
    public void RegistrationPage() throws InterruptedException {
        WaitTimeOutLoad();
        if (driver.findElement(RegistrationPage).isDisplayed()){
            driver.findElement(RegistrationPage).click();
            Assert.assertEquals(driver.getTitle(),"Daftar Akun Bukalapak | Bukalapak");
            Thread.sleep(3000);
            takeScreenshoot();
        }
    }


    public void newEmail(String args) throws InterruptedException {
        WaitTimeOutLoad();
        driver.findElement(inpNewEmail).sendKeys(args);
        driver.findElement(nextReg).click();
        driver.close();
    }
    public void setAlreadyEmail(String args) throws InterruptedException {
        WaitTimeOutLoad();
        driver.findElement(inpNewEmail).sendKeys(args);
        driver.findElement(nextReg).click();
        driver.findElement(sendCode).click();
        if (driver.findElement(alreadyEmail).isDisplayed()) {
            driver.findElement(alreadyEmail).click();
            Assert.assertEquals(driver.findElement(alreadyEmail).getText(), "Akun sudah terdaftar");
            driver.findElement(MoveLoginTab).click();
            Thread.sleep(3000);
            takeScreenshoot();
            driver.close();
        }
    }





//    Login

    public void LoginPage() throws InterruptedException {
        WaitTimeOutLoad();
        driver.findElement(LoginPage).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(OnLoginPage));
        boolean element = driver.findElement(OnLoginPage).getText().equals("Login dulu, yuk");
        Assert.assertEquals(element, true);
        System.out.println("Ensure on Login Page : " + element);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        if (driver.findElement(Username).isDisplayed()){
            boolean element1 = driver.findElement(Username).isDisplayed();
            Assert.assertEquals(element1, true);
            takeScreenshoot();
        }
    }

    public void InputUsername() {
        driver.findElement(Username).sendKeys(testData.getUsername());
        driver.findElement(Next).click();

    }

    public void InputPassword() throws InterruptedException {
        driver.findElement(Password).sendKeys(testData.getPassword());
        if (driver.findElement(Password).isDisplayed()){
            boolean element1 = driver.findElement(Password).isDisplayed();
            Assert.assertEquals(element1, true);
            takeScreenshoot();
        }
        WaitTimeOutLoad();
    }

    public void clicklogin() {
        driver.findElement(clickLogin).click();
        WaitTimeOutLoad();
        if (driver.findElement(searchType).isDisplayed()){
            takeScreenshoot();
        }
    }
    public void LogoutAccount(){
        WaitTimeOutLoad();
        driver.findElement(avatar).click();
        driver.findElement(logout).click();
    }
    public void setSearchType(String barang) throws InterruptedException {
        if (driver.findElement(searchType).isDisplayed())
        {
            driver.findElement(searchType).sendKeys(barang);
            Thread.sleep(1000);
            driver.findElement(submitSearch).click();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            if(driver.findElement(clickListBarang).isDisplayed()){
                Thread.sleep(2000);
                takeScreenshoot();
            }
        } else {
            driver.findElement(home).click();
            driver.findElement(home).isDisplayed();
            takeScreenshoot();
            LogoutAccount();
        }
    }

    public void setAdtoCharts() throws InterruptedException {
        if (driver.findElement(searhResult).isDisplayed()){
            driver.findElement(clickListBarang).click();
            driver.findElement(addToChart).getText().equals("Masukkan Keranjang");
            driver.findElement(addToChart).click();
            Thread.sleep(3000);
            takeScreenshoot();
            driver.findElement(Close).click();
            LogoutAccount();
            driver.close();
//            if (driver.findElement(pagePayment).isDisplayed()){
//                if (driver.findElement(chartAppears).isDisplayed()){
//                    takeScreenshoot();
//                }
//            }
        }
        else {
            driver.findElement(home).click();
            driver.findElement(home).isDisplayed();
            Thread.sleep(3000);
            takeScreenshoot();
            LogoutAccount();
        }
    }
}
