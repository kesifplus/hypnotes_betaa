package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(css = "input[placeholder='Full name']")
    public WebElement nameButton;

    @FindBy(css = "input[placeholder='Email']")
    public WebElement emailButton;

    @FindBy(css = "input[placeholder='Password']")
    public WebElement passwordButton;

    @FindBy(css = "button[type='submit']")
    public WebElement signUpButton;

    @FindBy(xpath = "//*[text()='Therapist']")
    public WebElement thearapistSignUpButton;


}




