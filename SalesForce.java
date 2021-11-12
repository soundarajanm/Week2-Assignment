package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Sales = new ChromeDriver();
		Sales.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		Sales.manage().window().maximize();
		Sales.findElement(By.name("UserFirstName")).sendKeys("Computer");
		Sales.findElement(By.name("UserLastName")).sendKeys("C");
		Sales.findElement(By.name("UserEmail")).sendKeys("Computer@gmail.com");
		
		WebElement JobDd = Sales.findElement(By.name("UserTitle"));
		Select select= new Select(JobDd);
		select.selectByValue("IT_Manager_AP");
		
		Sales.findElement(By.name("CompanyName")).sendKeys("MegaComputer");
		
		WebElement Emp = Sales.findElement(By.name("CompanyEmployees"));
		Select select1 =new Select(Emp);
		select1.selectByValue("9");
		
		Sales.findElement(By.name("UserPhone")).sendKeys("987456321");
		
		Sales.findElement(By.className("checkbox-ui")).click();
		
//		Sales.close();
		
		

	}

}
