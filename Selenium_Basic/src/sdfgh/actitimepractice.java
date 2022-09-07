package sdfgh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimepractice {
	public static void main(String[] args) throws InterruptedException {
		
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver actitime = new ChromeDriver();
		actitime.manage().window().maximize();
		actitime.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		actitime.get("https://demo.actitime.com/login.do");
	    actitime.findElement(By.id("username")).sendKeys("admin");
	    actitime.findElement(By.name("pwd")).sendKeys("manager");
	    actitime.findElement(By.id("loginButton")).click();
	    actitime.findElement(By.cssSelector("div[id='container_tasks']")).click();
	    Thread.sleep(3000);
	    actitime.findElement(By.cssSelector("div[class='title ellipsis']")).click();
	    actitime.findElement(By.cssSelector("div[class='item createNewTasks']")).click();
		actitime.findElement(By.cssSelector(".createTasksTable>tbody>*:first-child *:first-child>input[class='inputFieldWithPlaceholder']")).sendKeys("new task a1");  
		actitime.findElement(By.cssSelector(".taskTableContainer>.createTasksTable>tbody>*:first-child>:nth-of-type(6)>.components_checkboxContainer>:last-child")).click();
	    actitime.findElement(By.cssSelector(".basicLightboxFooter> .buttonsBox>*:nth-child(3)> .components_button")).click();
	}

}
