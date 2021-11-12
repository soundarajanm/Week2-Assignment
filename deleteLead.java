package Assigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deleteLead {

	public static void main(String[] args) throws InterruptedException {
		 
	
		 //1	Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//2	Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(5000);
		//6	Click Leads link
		driver.findElement(By.linkText("Leads")).click(); 
		//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//8	Click on Phone
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//9	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
		//10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//11	Capture lead ID of First Resulting lead
		String path = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
		System.out.println(path);
		//12	Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		//13	Click Delete
		driver.findElement(By.linkText("Delete")).click();
		//14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//15	Enter captured lead ID
		driver.findElement(By.id("id")).sendKeys(path);
		//16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		WebElement check=driver.findElement(By.className("x-paging-info"));
		boolean display=check.isDisplayed();
		
		if(display=true)
			System.out.println("Deletion successful");
		//18	Close the browser (Do not log out)
		driver.close();
		


	}

}
