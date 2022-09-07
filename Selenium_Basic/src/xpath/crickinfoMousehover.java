package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class crickinfoMousehover {

	public static void main(String[] args) throws InterruptedException {
		String dir = System.getProperty("user.dir");
		String path = dir + ".\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver crick= new ChromeDriver();
		crick.manage().window().maximize();
		crick.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		crick.get("https://www.espncricinfo.com/");
		crick.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		List<WebElement> list = crick.findElements(By.xpath("//div[@class='ds-flex ds-items-center ds-justify-between ds-flex-1']/div/div"));
	    System.out.println("count of menu: " + list.size());
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
		}
	     Actions act = new Actions(crick);
	     for(int i=0; i<list.size(); i++) {
	    	 WebElement option=list.get(i);
	    	 act.moveToElement(option).perform();
	    	 Thread.sleep(1000);
	    	try {
	    		List<WebElement> fashionMenu = crick.findElements(By.xpath("//div[@class='ds-bg-fill-content-prime ds-shadow-elevated ds-rounded-lg']/div/ul/li")); 
	    	     for(WebElement e: fashionMenu){
	    	    	 System.out.println("menus list: "+ e.getText());
	    	    	  }
	    	     System.out.println("**********************");
	       	  
	    	}
	    	 catch(Exception ex){
	    		
	    	 }
	     }
	     

	}

}
