package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SessionPage extends BasePage{
    @FindBy(xpath ="//*[text()='Sessions']")
    public WebElement sessionsLink;
    @FindBy(xpath = "//*[text()='Add new session']")
    public WebElement addNewSessionButton;
    @FindBy(xpath = "//*[text()='Associated Problems:']//following::button")
    public WebElement associatedProblemLink;
    @FindBy(xpath = "//*[text()='Problem is successfully linked.']")
    public WebElement problemIsSuccessfullyLinkedAlert;
    @FindBy(xpath = "//*[text()='Problem is successfully unlinked.']")
    public WebElement problemIsSuccessfullyUnlinkedAlert;
    @FindBy(xpath = "//*[text()='Note updated']")
    public WebElement noteUpdatedAlert;
    @FindBy(xpath = "//*[text()='After thoughts updated']")
    public WebElement afterThoughtsUpdatedAlert;
    @FindBy(xpath = "//*[@name='keyPoints']")
    public WebElement keyPointsBox;
    @FindBy(xpath = "//*[@name='afterThoughts']")
    public WebElement afterThoughtsBox;
    @FindBy(xpath = "//*[@name='suggestions']")
    public WebElement applicationsAndSuggestionsBox;
    @FindBy(xpath = "//*[text()='Delete Session']")
    public WebElement deleteSessionButton;
    @FindBy(xpath = "//*[text()='Yes']")
    public WebElement areYouSureToDeleteYesButton;
    @FindBy(xpath = "//*[text()='Session is successfully deleted.']")
    public WebElement sessionIsSuccessfullyDeletedAlert;

}
