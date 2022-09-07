 package day02.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger {
	public static void main(String[] args) throws InterruptedException {
			String hrm = System.getProperty("user.dir");
			String path = hrm + "\\Executable\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			
			ChromeDriver vtiger = new ChromeDriver();
			vtiger.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			vtiger.get("https://demo.vtiger.com/vtigercrm/index.php");
			String url = vtiger.getCurrentUrl();
			System.out.println("url validation: "+url.contains("https://demo.vtiger.com/vtigercrm/index.php"));
			String title = vtiger.getTitle();
			System.out.println("title validation "+title.equals("vtiger"));
         WebElement user = vtiger.findElement(By.id("username"));
         user.clear();
         user.sendKeys("admin");

         WebElement user1 = vtiger.findElement(By.name("password"));
         user1.clear();
         user1.sendKeys("Test@123");
         
         WebElement user2 = vtiger.findElement(By.className("button"));
         user2.click();
         
         Thread.sleep(2000);
         
         String hometitle = vtiger.getTitle();
         System.out.println("home page title validation: "+ hometitle.equals("Dashboard"));
         
         vtiger.findElement(By.cssSelector(".addButton.dropdown-toggle")).click(); 
         vtiger.findElement(By.cssSelector("a[data-name='History']")).click();
         vtiger.findElement(By.cssSelector(".addButton.dropdown-toggle")).click(); 
         vtiger.findElement(By.cssSelector("a[data-name='LeadsByStatus']")).click();
         vtiger.findElement(By.cssSelector(".addButton.dropdown-toggle")).click(); 
         vtiger.findElement(By.cssSelector("a[data-name='GroupedBySalesStage']")).click();
         vtiger.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();
         vtiger.findElement(By.cssSelector("a[data-name='OpenTickets']")).click();
         vtiger.findElement(By.cssSelector("span[class='fa fa-user']")).click();
         vtiger.findElement(By.cssSelector("a[id='menubar_item_right_LBL_SIGN_OUT']")).click();
         
         vtiger.close();
	} 

}
