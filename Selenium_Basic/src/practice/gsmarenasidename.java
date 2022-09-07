package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarenasidename {

	public static void main(String[] args) {
		String Chpath=System.getProperty("user.dir")+ "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Chpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		
		List<WebElement> count = driver.findElements(By.cssSelector("aside>.brandmenu-v2.light.l-box.clearfix>ul>li>a"));
		for(int i=0;i<count.size();i++) {
			System.out.println(count.get(i).getText());
			
		}
	}

}
