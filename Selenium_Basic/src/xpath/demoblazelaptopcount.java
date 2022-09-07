package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblazelaptopcount {

	public static void main(String[] args) {
		String chromeExePath = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver dmb = new ChromeDriver();
		dmb.manage().window().maximize();
		dmb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dmb.get("https://www.demoblaze.com/");
		//not clicked
		//dmb.findElement(By.cssSelector("a[onclick='byCat('notebook')']")).click();
		List<WebElement> laptop = dmb.findElements(By.xpath("//a[@class='hrefch']"));
		List<WebElement> price = dmb.findElements(By.cssSelector("#tbodyid div>h5"));
		
		 for(int i=0;i<laptop.size();i++) {
			 System.out.println(laptop.get(i).getText()+" "+price.get(i).getText());
		 }
		

	}

}
