package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkartMousehover {
public static void main(String[] args) throws InterruptedException {
	
	String dir = System.getProperty("user.dir");
	String path = dir + ".\\Executable\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	
	WebDriver fktmouse= new ChromeDriver();
	fktmouse.manage().window().maximize();
	fktmouse.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	fktmouse.get("https://www.flipkart.com");
	fktmouse.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
	List<WebElement> list = fktmouse.findElements(By.xpath("//*[@class='_37M3Pb']/div"));
    System.out.println("count of menu: " + list.size());
	for(int i=0; i<list.size();i++) {
		System.out.println(list.get(i).getText());
		
	}
     Actions act = new Actions(fktmouse);
     for(int i=0; i<list.size(); i++) {
    	 WebElement option=list.get(i);
    	 act.moveToElement(option).perform();
    	 Thread.sleep(1000);
    	try {
    		List<WebElement> fashionMenu = fktmouse.findElements(By.xpath("//div[@class='_2IjXr8']")); 
    	     for(WebElement e: fashionMenu){
    	    	 System.out.println("product list in menu's are: "+ e.getText());
    	    	  }
    	     System.out.println("**********************");
       	  
    	}
    	 catch(Exception ex){
    		
    	 }
     }
     
    /* 
     List<WebElement> elecMenu = fktmouse.findElements(By.xpath("//div[@class='_2IjXr8']/div/a")); 
     for(WebElement e: elecMenu){
    	 System.out.println("product list in electronics menu's are: "+ e.getText());
     }*/
}
}
