package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_menu {

	public static void main(String[] args) throws InterruptedException {
	
		
		String esp = System.getProperty("user.dir");
		String path = esp + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver info = new ChromeDriver();
		info.manage().window().maximize();
		info.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		info.get("https://www.flipkart.com/");

		List<WebElement> flp=info.findElements(By.cssSelector("._37M3Pb>.eFQ30H"));
		System.out.println("Device count: "+flp.size());
		for(int i=0; i<flp.size();i++) {
			System.out.println(flp.get(i).getText());
			
		
			
		}
	}}
	


