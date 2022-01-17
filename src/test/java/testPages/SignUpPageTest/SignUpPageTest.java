package testPages.SignUpPageTest;


import configuration.common.WebBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUpPageTest extends WebBase {
    SignUpPage signUpPage;

    @BeforeMethod
    public void getInit() {
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
    }

    @Test
    public void testSignUp() throws InterruptedException {
        signUpPage.clickOnAccountAndLists();
        //Thread.sleep(5000);
        waitFor(2);
        signUpPage.enterEmailForSignIn();
    }



}
