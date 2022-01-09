package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {

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

		
		//Click on Leads Tab

		driver.findElement(By.linkText("Leads")).click();

		//Create Lead

		driver.findElement(By.linkText("Create Lead")).click();


		//Enter Mandatory Fields-Company Name_firstname_lastname

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Carlin");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Reny.M");

		//Submit the Lead  Mandatory fields

		driver.findElement(By.className("smallSubmit")).click();

		//Print First Name and Browser Title

        String Browsername = driver.getTitle();
        
        System.out.println(Browsername);

		//Close the Browser

		//driver.close();


	}
}
