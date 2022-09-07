package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoTesting {
 public static void main(String[] args) throws InterruptedException {
	 String dir = System.getProperty("user.dir");
		String path = dir + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver demo = new ChromeDriver();
		demo.manage().window().maximize();
		demo.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		demo.get("https://demo.automationtesting.in/Register.html");

		WebElement fname=demo.findElement(By.xpath("//*[@ng-model='FirstName']"));
		fname.sendKeys("Dilshad",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"),Keys.TAB);
		demo.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.TAB);
		demo.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Pune Maharashtra",Keys.TAB);
		demo.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("abcd@gmail.com",Keys.TAB);
		demo.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("9876543210",Keys.TAB);
		demo.findElement(By.xpath("//*[@value='Male']")).sendKeys(Keys.SPACE,Keys.TAB);
		demo.findElement(By.xpath("//*[@value='Cricket']")).sendKeys(Keys.SPACE,Keys.TAB);
		demo.findElement(By.xpath("//*[@value='Movies']")).sendKeys(Keys.SPACE,Keys.TAB);
		demo.findElement(By.xpath("//*[@value='Hockey']")).sendKeys(Keys.SPACE,Keys.TAB);
	//	demo.findElement(By.xpath("//*[@id='msdd']")).click();
	//	demo.findElement(By.xpath("//a[text()='Hindi']")).click();
		demo.findElement(By.xpath("//*[@ng-model='Skill']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		demo.findElement(By.xpath("//span[@role='combobox']")).sendKeys(Keys.ENTER);
		demo.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India",Keys.ENTER);
		
		
		
		WebElement year = demo.findElement(By.xpath("//*[@ng-model='yearbox']"));		
		
		for(int i=1915; i<1996; i++) {
			
			year.sendKeys(Keys.ARROW_DOWN);
		}
		
		year.sendKeys(Keys.TAB);
		WebElement month = demo.findElement(By.xpath("//*[@ng-model='monthbox']"));
            for(int i=0; i<4; i++) {
			
			month.sendKeys(Keys.ARROW_DOWN);
		}
            month.sendKeys(Keys.TAB);
    		WebElement day = demo.findElement(By.xpath("//*[@ng-model='daybox']"));
                for(int i=0; i<23; i++) {
                day.sendKeys(Keys.ARROW_DOWN);
    			}
            day.sendKeys(Keys.TAB);
        demo.findElement(By.xpath("//*[@ng-model='Password']")).sendKeys("password@123",Keys.TAB);
        demo.findElement(By.xpath("//*[@ng-model='CPassword']")).sendKeys("password@123",Keys.TAB);
        demo.findElement(By.xpath("//*[@id='submitbtn']")).sendKeys(Keys.ENTER);
        
		
		/*WebDriverWait w1= new WebDriverWait(demo,5);
     	w1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//*[@id='msdd']")));
		demo.findElement(By.cssSelector("//*[@id='msdd']")).click();
		demo.findElement(By.cssSelector("//a[text()='Hindi']")).click();
	*/
		
}


}
