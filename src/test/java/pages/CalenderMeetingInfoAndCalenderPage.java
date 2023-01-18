package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalenderMeetingInfoAndCalenderPage extends BasePage{
    @FindBy(xpath = "//span[contains(text(),'Scheduling')]")
    public WebElement schedulingButton;

    @FindBy(xpath = "//a[contains(text(),'Calendar')]")
    public WebElement calenderButton;

    @FindBy(css = ".fc-event-main")
    public List<WebElement> sumMeeting;



}
