package day06._Aug11_seleniumwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM {

	public static void main(String[] args) throws InterruptedException {
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver hrms = new ChromeDriver();
		hrms.get("https://opensource-demo.orangehrmlive.com");
	
		hrms.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement user=hrms.findElement(By.id("txtUsername"));
		System.out.println("User name is displayed or not? "+user.isDisplayed());
		System.out.println("User name is functional or not? "+user.isEnabled());
		
		WebElement pass=hrms.findElement(By.id("txtPassword"));
		System.out.println("pasasowrd is displayed or not? "+pass.isDisplayed());
		System.out.println("password is functional or not? "+pass.isEnabled());
		
		WebElement loginbtn=hrms.findElement(By.id("btnLogin"));
		System.out.println("login button is displayed or not? "+loginbtn.isDisplayed());
		
		WebElement forgetpass=hrms.findElement(By.id("forgotPasswordLink"));
		System.out.println("forget password is displayed or not? "+ forgetpass.isDisplayed());
		
		String url ="https://opensource-demo.orangehrmlive.com/";
		String curl = hrms.getCurrentUrl();
		String gt = hrms.getTitle();
		String ct = "OrangeHRM";
		System.out.println("compairing title: " + gt.contains(ct));
		System.out.println("compairing url: " + url.contains(curl));
		String pgs = hrms.getPageSource();
		System.out.println("page source length: " + pgs.length());
		
		Thread.sleep(2000);
		
		WebElement user0 = hrms.findElement(By.id("txtUsername"));
        user0.clear();
        user0.sendKeys("Admin");

        WebElement user1 = hrms.findElement(By.name("txtPassword"));
        user1.clear();
        user1.sendKeys("admin123");
        
        WebElement user2 = hrms.findElement(By.className("button"));
        user2.click();
       
        hrms.findElement(By.id("welcome")).click();
        hrms.findElement(By.linkText("Logout")).click();
        
		hrms.close();

	}

}
