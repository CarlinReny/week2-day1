package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeAssignment {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();		

		//Launch the Chrome Browser

		ChromeDriver driver = new ChromeDriver();

		//Load the URL

		driver.get("https://acme-test.uipath.com/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String Title= driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.linkText("Log Out")).click();
		
		driver.close();
	}

}
