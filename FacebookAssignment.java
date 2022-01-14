package week2.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();		

		//Launch the Chrome Browser

		ChromeDriver driver = new ChromeDriver();

		//Load the URL

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create New Account")).click();

		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Account");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.name("reg_passwd__")).sendKeys("newpassword");

		//locate the element with select tag

		WebElement Birthday = driver.findElement(By.id("day"));

		//create object for select class

		Select day =new Select(Birthday);

		//choose options from the dropdown

		day.selectByVisibleText("25");

		//locate element with select tag

		WebElement birthmonth = driver.findElement(By.id("month"));

		//create object for select class

		Select month = new Select(birthmonth);

		month.selectByIndex(9);

		//locate the element with select tag

		WebElement Birthyear = driver.findElement(By.id("year"));

		//create object for select class

		Select year =new Select(Birthyear);

		//choose options from the dropdown

		year.selectByVisibleText("1994");
		
		driver.findElement(By.name("sex")).click();

	}
}
