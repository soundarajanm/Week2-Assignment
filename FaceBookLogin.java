package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver faceBook=new ChromeDriver();
		faceBook.get("https://www.facebook.com/");
		faceBook.manage().window().maximize();
		faceBook.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		faceBook.findElement(By.name("firstname")).sendKeys("Soundar");
		faceBook.findElement(By.name("lastname")).sendKeys("M");
		faceBook.findElement(By.name("reg_email__")).sendKeys("123654789");
		faceBook.findElement(By.id("password_step_input")).sendKeys("P@ssw0rd");
		WebElement DdAge = faceBook.findElement(By.id("day"));
		Select select = new Select(DdAge);
		select.selectByValue("1");
		
		WebElement DdMonth = faceBook.findElement(By.id("month"));
		Select select1 = new Select(DdMonth);
		select1.selectByVisibleText("May");
		
		WebElement DdYear = faceBook.findElement(By.id("year"));
		Select select2 = new Select(DdYear);
		select2.selectByValue("1995");
		
		faceBook.findElement(By.name("sex")).click();
		
		
	}

}
