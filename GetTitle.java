package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver= new ChromeDriver();
		Driver.get("https://acme-test.uipath.com/login");
		Driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		Driver.findElement(By.id("password")).sendKeys("leaf@12");
		Driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String Title= Driver.getTitle();
		System.out.println(Title);
		Thread.sleep(5000);
		Driver.close();

	}

}
