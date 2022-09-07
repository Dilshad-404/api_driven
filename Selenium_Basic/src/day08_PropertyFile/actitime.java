package day08_PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException, IOException {
	
	not working from property file	

	   
		FileInputStream act = new FileInputStream(".\\propertyfiles\\actitime.properties");
		Properties prop = new Properties();
		prop.load(act);
		
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\propertyfiles\\actitime.properties";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver actitime = new ChromeDriver();
		actitime.manage().window().maximize();
		actitime.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		actitime.get("url");
		
		
		
		
		actitime.findElement(By.name("username")).sendKeys("admin");
        actitime.findElement(By.name("pass")).sendKeys("value2");
        
        
        actitime.findElement(By.className("initial")).click();
        Thread.sleep(2000);
           
        String homepagetitle = actitime.getTitle();
        
    	System.out.println("Home Page Title: "+ homepagetitle);
    	System.out.println("compairing home page title: "+ homepagetitle.equals("hptitle"));
        
    	actitime.findElement(By.id("id")).click();
    	//Thread.sleep(2000);
    	actitime.findElement(By.cssSelector("div[class='title ellipsis']")).click();
    	actitime.findElement(By.cssSelector("div[class='item createNewTasks']")).click();
    	actitime.findElement(By.cssSelector(".createTasksTable>tbody>*:first-child>*:first-child .inputFieldWithPlaceholder")).sendKeys("raman");
    	actitime.findElement(By.cssSelector("td>label[class='components_checkboxContainer checkboxContainer']>:nth-child(2)")).click();
    	actitime.findElement(By.cssSelector(".customerProjectSelectorPlaceholder>div>*:last-child>tbody>.selectCustomerRow>td>.customerSelector")).click();
    	
    	actitime.findElement(By.cssSelector(".basicLightboxFooter>*:last-child>*:nth-child(3)")).click();
    	actitime.findElement(By.cssSelector(".createdTasksRowsTable>tbody .selection")).click();
    	actitime.findElement(By.cssSelector("tbody>.selectCustomerRow .components_combobox.cpCombobox")).click();
    	Thread.sleep(2000);
    	actitime.findElement(By.cssSelector("div[class='delete button']")).click();
    	actitime.findElement(By.cssSelector(".deleteDialog>div>div>div>*:last-child>div>div>span")).click();
    	
    	//actitime.findElement(By.id("logoutLink")).click();
		//actitime.close();
		
    	
	}

}
