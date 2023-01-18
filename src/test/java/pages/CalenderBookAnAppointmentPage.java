package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

import static java.util.Calendar.DATE;


public class CalenderBookAnAppointmentPage extends BasePage {
    @FindBy(xpath = "//span[contains(text(),'Scheduling')]")
    public WebElement scheduling;
    @FindBy(xpath = "//a[contains(text(),'Calendar')]")
    public WebElement scheduling_calendar;
    @FindBy(css = "button.calendar_genricBtnTextSuccessBorder__cIuju")
    public WebElement scheduleAnAppointment;
    @FindBy(xpath = "//tbody/tr[4]/td[1]/div[1]")
    public WebElement appoinmentDateNumber18;
    @FindBy(css = ".ant-drawer.ant-drawer-right.ant-drawer-open")
    public WebElement bookAnAppointmentPage;

    @FindBy(css = "#registered")
    public WebElement registeredServiceRadioButton;
    @FindBy(css = "#service")
    public WebElement servicesDropdown;
    @FindBy(xpath = "//span[@title='Online']")
    public WebElement locationDropdown;


    public void dateDate(int index) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        calendar.add(DATE, index);
        Driver.getDriver().findElement(By.xpath("//td[@data-date='" + dateFormat.format(calendar.getTime()) + "']")).click();
    }

    @FindBy (xpath = "//td[@data-date='2023-01-02']")
    public WebElement calendarDay;

    @FindBy (xpath = "//span[normalize-space()='Custom Service']")
    public WebElement radioButtonCustomService;

    @FindBy (xpath = "//input[@id='basic_title']")
    public WebElement inputServiceName;

    @FindBy (xpath = "//input[@id='basic_price']")
    public WebElement inputPrice;

    @FindBy (xpath = "//input[@id='basic_duration']")
    public WebElement inputDuration ;

    @FindBy (xpath = "//input[@id='notNotify']")
    public WebElement doNotnatifyClientButton;

    @FindBy (xpath = "//span[normalize-space()='New Meeting Created']")
    public  WebElement alertMessageNewMeetingCreated;

    @FindBy(xpath = "//button[@id='submit']")
    public  WebElement bookAnAppointmentSubmitButton;




}
