package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateContact {


	public static void main(String[] args) {

		//Setup the Driver

		WebDriverManager.chromedriver().setup();		

		//Launch the Chrome Browser

		ChromeDriver driver = new ChromeDriver();

		//Load the URL

		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize the Browser

		driver.manage().window().maximize();

		//Get Title

		String title = driver.getTitle();
		System.out.println(title);

		// Getting Username element and entering value

		WebElement Username = driver.findElement(By.id("username"));	
		Username.sendKeys("DemoSalesManager");

		//Getting Password element and entering value in 

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//press Login button

		driver.findElement(By.className("decorativeSubmit")).click();

		//Click CRM/SFA

		driver.findElement(By.linkText("CRM/SFA")).click();

		//click on Contacts Tab

		driver.findElement(By.linkText("Contacts")).click();

		//Create Contact Tab

		driver.findElement(By.linkText("Create Contact")).click();

		//Enter the Create contact mandatory Fields

		driver.findElement(By.id("firstNameField")).sendKeys("Carlin");

		driver.findElement(By.id("lastNameField")).sendKeys("Reny.M");

		driver.findElement(By.className("smallSubmit")).click();



	}
}
