package Assigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createContact {

	public static void main(String[] args) {
	
		 // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		  
		// * 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		  
		// * 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		 
		// * 5. Click on contacts Button
		  driver.findElement(By.linkText("Contacts")).click();
		// * 6. Click on Create Contact
		  driver.findElement(By.linkText("Create Contact")).click();
		// * 7. Enter FirstName Field Using id Locator
		  driver.findElement(By.id("firstNameField")).sendKeys("Soundar");
		  		  
		//* 8. Enter LastName Field Using id Locator
		  driver.findElement(By.id("lastNameField")).sendKeys("M");
		// * 9. Enter FirstName(Local) Field Using id Locator
		  driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sounda");
		 // 10. Enter LastName(Local) Field Using id Locator
		  driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("m");
		 //* 11. Enter Department Field Using any Locator of Your Choice
		  driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Electronics");
		  //* 12. Enter Description Field Using any Locator of your choice .
		  driver.findElement(By.id("createContactForm_description")).sendKeys("What to do");
		   // 13. Enter your email in the E-mail address Field using the locator of your choice
		  driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kumar.testleaf@gmail.com");
		 // 14. Select State/Province as NewYork Using Visible Text
		 WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select select = new Select(State);
		 select.selectByVisibleText("New York");		 
		 //15. Click on Create Contact
		 driver.findElement(By.name("submitButton")).click();
		  //16. Click on edit button 
		driver.findElement(By.linkText("Edit")).click();
		// 17. Clear the Description Field using .clear
		  driver.findElement(By.id("updateContactForm_description")).clear();
		 //18. Fill ImportantNote Field with Any text
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important");
		 // 19. Click on update button using Xpath locator
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 // 20. Get the Title of Resulting Page.
         String Title =driver.getTitle();
        System.out.println(Title);

	}

}
