package day07_Aug_13_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver google = new ChromeDriver();
		google.manage().window().maximize();
		google.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		google.get("https://www.google.com");
		
		String curl = google.getCurrentUrl();
		System.out.println("current url: "+ curl);
		System.out.println("page source length: "+google.getPageSource().length());
		google.findElement(By.name("q")).sendKeys("list of hill station in india");
	    List<WebElement> sugg=google.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>div:nth-of-type(2)>span"));
	    System.out.println("suggestion count "+ sugg.size());
	    for(int i=0; i<sugg.size(); i++) {
	    	
	    	System.out.println(sugg.get(i).getText());
		    }
	   // google.close();
		

	}

}
