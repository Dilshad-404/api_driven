package day07_Aug_13_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class executeautomation {

	public static void main(String[] args) throws InterruptedException {
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver eauto = new ChromeDriver();
		eauto.manage().window().maximize();
		eauto.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		eauto.get("https://demosite.executeautomation.com");
		 String title = eauto.getTitle();
		 System.out.println("current title is: "+ title);
		 System.out.println("current title length is: "+ title.length());
		String curl = eauto.getCurrentUrl();
		System.out.println("current page url: "+ curl.contains("https://demosite.executeautomation.com"));
		eauto.findElement(By.name("UserName")).sendKeys("execution");
		eauto.findElement(By.name("Password")).sendKeys("admin");
		eauto.findElement(By.cssSelector("input[name='Login']")).click();
		
		Thread.sleep(2000);
		System.out.println("home page title is: "+ eauto.getTitle());
		System.out.println("current url is: "+ eauto.getCurrentUrl());
		eauto.findElement(By.cssSelector("a[href='Login.html']")).click();
		Thread.sleep(2000);
		//eauto.close();
	}

}
