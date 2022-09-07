package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Espinfo {

	public static void main(String[] args) throws InterruptedException {
	
		
		String esp = System.getProperty("user.dir");
		String path = esp + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver info = new ChromeDriver();
		info.manage().window().maximize();
		info.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		info.get("https://www.espncricinfo.com/");

		//info.findElement(By.cssSelector(".ds-flex.ds-flex-row>div>.ci-nav-item.ci-nav-text.ci-nav-hover.ds-cursor-pointer]")).click();
		List<WebElement> asd=info.findElements(By.cssSelector("div>.ci-nav-item.ci-nav-text.ci-nav-hover.ds-cursor-pointer"));
		System.out.println("Device count: "+asd.size());
		for(int i=0; i<asd.size();i++) {
			System.out.println(asd.get(i).getText());
			
		
			
		}
	}}
	


