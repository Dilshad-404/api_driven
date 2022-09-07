package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsm {

	public static void main(String[] args) throws InterruptedException {
	
		
		String gsm = System.getProperty("user.dir");
		String path = gsm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver arena = new ChromeDriver();
		arena.manage().window().maximize();
		arena.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		arena.get("https://www.gsmarena.com");

		arena.findElement(By.cssSelector("a[href='microsoft-phones-64.php']")).click();
		List<WebElement> asd=arena.findElements(By.cssSelector("div>ul>li>a>strong>span"));
		System.out.println("Device count: "+asd.size());
		//for(int i=0; i<asd.size();i++) {
			//System.out.println(asd.get(i).getText());
			
		//}
		
		
		for(WebElement i : asd) {
			System.out.println(i.getText());
			
		}
	}}
	


