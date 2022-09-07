package day01_Aug_08_Openbroswer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBasicValidation {

	public static void main(String[] args) {
		
		//or using System class
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath3);
		//create an instance of required browser class
		WebDriver driver=new ChromeDriver();
		
		//enter the URL
		driver.get("https://www.flipkart.com");
		
		//validate page tile
		String pageTitle=driver.getTitle();
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("Title validation: "+pageTitle.equals(expectedTitle));
		//validate current url
		String pageURL=driver.getCurrentUrl();
		String expectedURL="https://www.flipkart.com/";
		System.out.println("Page URL validation: "+pageURL.equals(expectedURL));
		//get page source content length count
		int contentLength=driver.getPageSource().length();
		System.out.println("Content length: "+contentLength);		
		//close the current browser instance
		driver.close();
	}
}
