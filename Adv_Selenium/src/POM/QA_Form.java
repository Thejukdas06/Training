package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QA_Form 
{
@FindBy(id="firstName")
private WebElement FNtextfield;
@FindBy(id="lastName")
private WebElement LNtextfield;
@FindBy(id="userEmail")
private WebElement Emailtextfield;
@FindBy(xpath="//label[text()='Female']")
private WebElement FemaleRadioBtn;
@FindBy(id="userNumber")
private WebElement MNotextfield;
@FindBy (id="dateOfBirthInput")
private WebElement DOBtextfield;
@FindBy (id="subjectsContainer")
private WebElement Subtextfield;
@FindBy(xpath="//label[text()='Music']")
private WebElement MusicCheckBox;
@FindBy(id="uploadPicture")
private WebElement FileUploadBtn;
@FindBy(id="currentAddress")
private WebElement CurrentAddtextfield;
@FindBy(xpath="//div[text()='Select State']")
private WebElement SelStatetDD;
@FindBy (id="city")
private WebElement CityDD;
@FindBy (id="submit")
private WebElement SubmitBtn;

public  QA_Form(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void passFN(String FN)
{
	FNtextfield.sendKeys(FN);
}
public void passLN(String LN)
{
	LNtextfield.sendKeys(LN);
}
public void passEmail(String Email)
{
	Emailtextfield.sendKeys(Email);
}
public void clickRBtn()
{
	FemaleRadioBtn.click();
}
public void passNo(String No)
{
	MNotextfield.sendKeys(No);
}
public void passDOB()
{
	DOBtextfield.click();
}
public void passSub(String Sub)
{
	Subtextfield.sendKeys(Sub);
}
public void clickChBox()
{
	MusicCheckBox.click();
}
public void UploadFile(String File)
{
	FileUploadBtn.sendKeys(File);
}
public void passAdd(String Add)
{
	CurrentAddtextfield.sendKeys(Add);
}
public void clickStateDD()
{
	SelStatetDD.click();
}
public void clickCityDD()
{
	CityDD.click();
}
public void clickSubmitBtn()
{
	SubmitBtn.click();
}
}
