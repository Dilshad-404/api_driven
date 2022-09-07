package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagination {

	public static void main(String[] args) throws InterruptedException {
		String x = System.getProperty("user.dir");
		String path = x + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver page = new ChromeDriver();
		page.manage().window().maximize();
		page.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		page.get("https://www.gsmarena.com/samsung-phones-9.php");

		List<WebElement> nav=page.findElements(By.cssSelector(".nav-pages>a"));
		if(nav.size()>0) {
			System.out.println("pagination exist");
		}
		else {
			System.out.println("pagination not exist");
		}
		for(int i=0; i<nav.size(); i++) {
			System.out.println(nav.get(i).getText());
			
		}
		System.out.println(page.getCurrentUrl());
		
		for(int j=0; j<nav.size(); j++) {
			System.out.println(page.getCurrentUrl());
			nav.get(j).click();
			Thread.sleep(2000);
			nav = page.findElements(By.cssSelector(".nav-pages>a"));
		}
		System.out.println(page.getCurrentUrl());

		}

	}


