package day07_Aug_13_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		ChromeDriver flp = new ChromeDriver();
		flp.manage().window().maximize();
		// implicit wait
		flp.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		flp.get("https:flipkart.com");
	
	flp.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("6280391684");
	flp.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU')]")).sendKeys("Dilshad$007");;
	
	}
	}