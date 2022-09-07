package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
	
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver actitime = new ChromeDriver();
		actitime.manage().window().maximize();
		actitime.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		actitime.get("https://demo.actitime.com/login.do");

		System.out.println("compairing title: "+ actitime.getTitle().contains("actiTIME - Login"));
		System.out.println("compairing url: "+ actitime.getCurrentUrl().contains("https://demo.actitime.com/login.do"));
		
	/**	WebElement user = actitime.findElement(By.name("username"));
      * user.clear();
      * user.sendKeys("admin");
     */
        //or
        actitime.findElement(By.name("username")).sendKeys("admin");
       
        
        WebElement user1 = actitime.findElement(By.name("pwd"));
        user1.clear();
        user1.sendKeys("manager");
        
        WebElement user2 = actitime.findElement(By.className("initial"));
        user2.click();
        Thread.sleep(2000);
           
                   String homepagetitle = actitime.getTitle();
        
    	System.out.println("Home Page Title: "+ homepagetitle);
    	System.out.println("compairing home page title: "+ homepagetitle.equals("actiTIME - Enter Time-Track"));
        
    	System.out.println("Home Page Title length: "+ homepagetitle.length());
    	System.out.println("Home Page source length: "+ actitime.getPageSource().length());
        
    	actitime.findElement(By.id("container_tasks")).click();
    	//Thread.sleep(2000);
    	actitime.findElement(By.xpath("//div[text()='Add New']")).click();
    	actitime.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
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
