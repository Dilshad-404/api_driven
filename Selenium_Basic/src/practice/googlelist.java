package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlelist {

		public static void main(String[] args) throws InterruptedException {
			String chromeExePath = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver", chromeExePath);
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("list of hospital");
			
			List<WebElement> sugg=driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>div:nth-of-type(2)>span"));
			System.out.println("Suggestion count:" +sugg.size());
			
			for(int i=0; i<sugg.size(); i++) {
				System.out.println(sugg.get(i).getText());
								
			}
			/*for(WebElement e : sugg) {
				System.out.println(e.getText());
			}*/
		}

	


	}


