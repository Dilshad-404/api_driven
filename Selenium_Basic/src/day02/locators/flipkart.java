package day02.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		ChromeDriver flp = new ChromeDriver();
		flp.get("https:flipkart.com");
		
		WebElement user = flp.findElement(By.className("_1fqY3P"));
        user.clear();
        user.sendKeys("6280391684");

        WebElement user1 = flp.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
        user1.clear();
        user1.sendKeys("Dilshad$007");
        
        WebElement user2 = flp.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL"));
        user2.click();



	}

}
