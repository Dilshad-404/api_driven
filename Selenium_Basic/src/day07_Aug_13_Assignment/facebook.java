package day07_Aug_13_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver fb = new ChromeDriver();
		fb.manage().window().maximize();
		fb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		fb.get("https://www.facebook.com");
		
		String extitle = "Facebook – log in or sign up";
		System.out.println("title validation: " + fb.getTitle().equals(extitle));
		System.out.println("home page title: "+ fb.getTitle());
		fb.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		
		WebElement fbday = fb.findElement(By.id("day"));
		System.out.println("checking day field is visible?  "+ fbday.isDisplayed());
		System.out.println("checking day field is enable?  "+ fbday.isEnabled());
		
		WebElement fbmonth = fb.findElement(By.id("month"));
		System.out.println("checking month field is visible? "+fbmonth.isDisplayed());
		System.out.println("checking month field is enable? "+fbmonth.isEnabled());
		
		WebElement fbyear = fb.findElement(By.id("year"));
		System.out.println("checking year field is visible? "+fbyear.isDisplayed());
		System.out.println("checking year field is enable? "+fbyear.isEnabled());
		
		Thread.sleep(5000);
		fb.close();
many more functionalities to go
	}

}
