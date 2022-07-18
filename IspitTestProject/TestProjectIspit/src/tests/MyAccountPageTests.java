package tests;

import org.junit.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.SignInPage;

public class MyAccountPageTests extends BaseTest {
    
    public HomePage homePage;
    public SignInPage signInPage;
    public MyAccountPage myAccountPage;

    String emailText = "srdjanomatori@gmail.com";
    String password = "Code23";
    String signInButton = "Sign in";

    @Test
    public void verifyLogOut(){
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        myAccountPage = new MyAccountPage(driver);

        homePage.basePage();
        homePage.signUpButton();
        signInPage.scrollDown();
        signInPage.login(emailText, password);
        myAccountPage.logOut();
        myAccountPage.verifyLogOut(signInButton);   
    }
}
