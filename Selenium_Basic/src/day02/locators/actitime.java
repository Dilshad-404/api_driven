package day02.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
	
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver actitime = new ChromeDriver();
		actitime.manage().window().maximize();
		actitime.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		actitime.get("https://demo.actitime.com/login.do");

		System.out.println("compairing title: "+ actitime.getTitle().contains("actiTIME - Login"));
		System.out.println("compairing url: "+ actitime.getCurrentUrl().contains("https://demo.actitime.com/login.do"));
		
	/**	WebElement user = actitime.findElement(By.name("username"));
      * user.clear();
      * user.sendKeys("admin");
     */
        //or
        actitime.findElement(By.name("username")).sendKeys("admin");
       
        
        WebElement user1 = actitime.findElement(By.name("pwd"));
        user1.clear();
        user1.sendKeys("manager");
        
        WebElement user2 = actitime.findElement(By.className("initial"));
        user2.click();
        Thread.sleep(2000);
           
                   String homepagetitle = actitime.getTitle();
        
    	System.out.println("Home Page Title: "+ homepagetitle);
        System.out.println("compairing home page title: "+ homepagetitle.equals("actiTIME -  Enter Time-Track"));
        actitime.findElement(By.id("logoutLink")).click();
		
	}

}
