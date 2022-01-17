package pages;

import configuration.common.WebBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static PageElements.SignInPageElements.*;


public class SignInPage extends WebBase {

    @FindBy(xpath = helloSignInWebElement)
    public WebElement helloSignIn;
    @FindBy(xpath = emailAndPhoneNumberWebElement)
    public WebElement emailAndPhoneNumber;
    @FindBy(xpath = continueButtonFromSignInPageWebElement)
    public WebElement continueButtonFromSignInPage;
    @FindBy(xpath = passwordFromSignInPageWebElement)
    public WebElement passwordFromSignInPage;
    @FindBy(xpath = signInButtonFromSignInPageWebElement)
    public WebElement signInButtonFromSignInPage;
    @FindBy(xpath = welcomeUserNameWebElement)
    public WebElement welcomeUserName;


    public void clickOnHelloSignIn(){
        helloSignIn.click();
    }
    public void enterEmailAndPhoneNumber(String userName){
        emailAndPhoneNumber.sendKeys(userName);
    }
    public void clickOnContinueButtonFromSignInPage(){
        continueButtonFromSignInPage.click();
    }
    public void enterPasswordFromSignInPage(String password){
        passwordFromSignInPage.sendKeys(password);
    }
    public void clickOnSignInButtonFromSignInPage(){
        signInButtonFromSignInPage.click();
    }
    public void verifyUserNameAfterSignIn(String expectedName){
        String actualName=welcomeUserName.getText();
        Assert.assertEquals(actualName,expectedName,"Name not match");
    }




}
