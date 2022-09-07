package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
	String dir = System.getProperty("user.dir");
	String path = dir + ".\\Executable\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
	
	WebDriver dragNdrop =  new ChromeDriver();
	dragNdrop.manage().window().maximize();
	dragNdrop.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    dragNdrop.get("https://the-internet.herokuapp.com/drag_and_drop");
	Actions a = new Actions(dragNdrop);
	WebElement source = dragNdrop.findElement(By.xpath("//div[@id='column-a']"));
	WebElement target = dragNdrop.findElement(By.xpath("//div[@id='column-b']"));
	
	for(int i=0; i<10; i++) {
		
		a.dragAndDrop(source, target).build().perform();
		Thread.sleep(1000);
	}
	}
}
