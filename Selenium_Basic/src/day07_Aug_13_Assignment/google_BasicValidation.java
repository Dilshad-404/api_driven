package day07_Aug_13_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_BasicValidation {

	public static void main(String[] args) {
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver google = new ChromeDriver();
		google.manage().window().maximize();
		google.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		google.get("https://www.google.com");
		String curl = google.getCurrentUrl();
		System.out.println("current url is: "+ curl);
		String pgsource = google.getPageSource();
		System.out.println("page source length is: "+ pgsource.length());
		google.close();
	
	}

}
