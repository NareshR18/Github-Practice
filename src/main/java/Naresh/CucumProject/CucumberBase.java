package Naresh.CucumProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import scala.annotation.meta.setter;

public class CucumberBase  {
	public static WebDriver driver;
	
	public static void Brow(String a) {
		if (a.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nares\\eclipse-workspace\\CucumberProject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (a.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\nares\\eclipse-workspace\\CucumberProject\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}
	public static void url() {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	public static void keys(WebElement ele, String val) throws IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\nares\\eclipse-workspace\\CucumProject\\src\\main\\java\\Naresh\\CucumProject\\AdactinHotel.properties");
		Properties p=new Properties();
		p.load(fis);
		String p1= p.getProperty(val);
		
		ele.sendKeys(p1);
	}
	
	public static void wait(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}
	public static void slp(int a) throws InterruptedException {
		Thread.sleep(a);
	}

	public static void quit() {
		driver.close();
	}

	public static void click(WebElement element) {
		element.click();	
	}
	
	
	public static void prop() throws IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\nares\\eclipse-workspace\\CucumProject\\src\\main\\java\\Naresh\\CucumProject\\AdactinHotel.properties");
		Properties p=new Properties();
		p.load(fis);
		
		
		
	}
	
	public static void pagefac(){
		
		PageFactory.initElements(driver, CucumberPOM.class);

	}
	public static void clr(WebElement eleme) {
		eleme.clear();
			
	}
	
	public static void select(WebElement e,String stype,String data) throws IOException {
	Select s= new Select(e);
	if(stype.equalsIgnoreCase("byvalue")) {
		s.selectByValue(data);
	}
	else if(stype.equalsIgnoreCase("byvisibletext")) {
		s.selectByVisibleText(data);
	}
	else if(stype.equalsIgnoreCase("byindex")) {
		int i = Integer.parseInt(data);
		s.selectByIndex(i);
	}
	}
	
	public static void screenshotbook( ) throws IOException {
		
		/*FileInputStream fis= new FileInputStream("C:\\Users\\nares\\eclipse-workspace\\CucumProject\\src\\main\\java\\Naresh\\CucumProject\\AdactinHotel.properties");
		Properties p=new Properties();
		p.load(fis);
		String p1= p.getProperty(property);
		*/
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File from=ss.getScreenshotAs(OutputType.FILE);
		
		File to= new File("C:\\Users\\nares\\eclipse-workspace\\CucumProject\\Screenshot\\bookeddetails.png");
		FileUtils.copyFile(from, to );
		
		}
	 
	public static void screenshotcancel() throws IOException {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File from=ss.getScreenshotAs(OutputType.FILE);
		File to1=new File("C:\\Users\\nares\\eclipse-workspace\\CucumProject\\Screenshot\\cancelleddetails.png");
		FileUtils.copyFile(from, to1);
		
		
	}
	
	
	public static void alert() {
		driver.switchTo().alert().accept();
		
	}
	
}
