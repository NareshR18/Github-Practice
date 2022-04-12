package Naresh.CucumProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CucumberPOM  {
	
	
	@FindBy(name="username")
	public static WebElement username;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(name="login")
	public static WebElement login;
	
	@FindBy (name="location")
	public static WebElement loc;
	
	@FindBy(id="hotels")
	public static WebElement hotel;
	
	@FindBy(id="room_type")
	public static WebElement  rt;
	
	
	@FindBy(id="room_nos")
	public static WebElement nor;
	
	
	@FindBy(name="datepick_in")
	public static WebElement cid;
	
	
	@FindBy(xpath="(//input[@type=\"text\"])[3]")
	public static WebElement cod;
	
	@FindBy(id="adult_room")
	public static WebElement adultcount;
	
	@FindBy(id="child_room")
	public static WebElement childcount;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	public static WebElement search;
	
	@FindBy(name="radiobutton_0")
	public static WebElement rselect;
	
	@FindBy(id="continue")
	public static WebElement continu;
	
	@FindBy(name="first_name")
	public static WebElement fname;
	
	@FindBy(name="last_name")
	public static WebElement lname;
	
	@FindBy(name="address")
	public static WebElement billadd;
	
	@FindBy(id="cc_num")
	public static WebElement ccno;
	
	@FindBy(id="cc_type")
	public static WebElement cctype;
	
	@FindBy(name="cc_exp_month")
	public static WebElement exmon;
	
	@FindBy(id="cc_exp_year")
	public static WebElement exyr;
	
	@FindBy(name="cc_cvv")
	public static WebElement cvv;
	
	@FindBy(xpath="(//input[@type=\"button\"])[1]")
	public static WebElement booknow;
	
	@FindBy(xpath="//input[@value=\"My Itinerary\"]")
	public static WebElement myite;
	
	@FindBy(xpath="(//input[@type=\"checkbox\"])[2]")
	public static WebElement radiobook;
	
	@FindBy(name="cancelall")
	public static WebElement cancel;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	public static WebElement logout;
	
	
	
	
	
	

}
