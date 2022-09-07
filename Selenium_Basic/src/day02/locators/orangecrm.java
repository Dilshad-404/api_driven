package day02.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangecrm {

	public static void main(String[] args) {
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		ChromeDriver hrms = new ChromeDriver();
		hrms.get("https://opensource-demo.orangehrmlive.com");
		
		WebElement user = hrms.findElement(By.id("txtUsername"));
        user.clear();
        user.sendKeys("Admin");

        WebElement user1 = hrms.findElement(By.name("txtPassword"));
        user1.clear();
        user1.sendKeys("admin123");
        
        WebElement user2 = hrms.findElement(By.className("button"));
        user2.click();
        hrms.close();

}
}