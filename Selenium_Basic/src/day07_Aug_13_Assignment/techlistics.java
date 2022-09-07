package day07_Aug_13_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistics {

	public static void main(String[] args) throws InterruptedException {
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver tlist = new ChromeDriver();
		tlist.manage().window().maximize();
		tlist.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		tlist.get("https://techlistic.com");
		
		tlist.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/java.html']")).click();
		Thread.sleep(1000);
		tlist.navigate().back();
		tlist.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html']")).click();
		Thread.sleep(1000);
		tlist.navigate().back();
		tlist.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/software-testing.html']")).click();
		tlist.close();
		

	}

}
