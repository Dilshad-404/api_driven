package day07_Aug_13_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class make_my_trip {

	public static void main(String[] args) throws InterruptedException {
	
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver mmt = new ChromeDriver();
		mmt.manage().window().maximize();
		mmt.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		mmt.get("https://makemytrip.com");
		mmt.findElement(By.cssSelector("a[href='https://www.makemytrip.com/bus-tickets/']")).click();
	    mmt.findElement(By.id("fromCity")).click();
	    mmt.findElement(By.cssSelector("ul[role='listbox']>*:nth-child(4)")).click();
        mmt.findElement(By.cssSelector("input[aria-autocomplete='list']")).click();
        mmt.findElement(By.cssSelector("ul[role='listbox']>*:nth-child(8)")).click();
        mmt.findElement(By.cssSelector(".DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>*:nth-child(3)>*:nth-child(3)")).click();
        mmt.findElement(By.cssSelector("a[class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
     
        //search btn not getting clicked
        
        /* 
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
    	actitime.findElement(By.cssSelector("div[class='title ellipsis']")).click();
    	actitime.findElement(By.cssSelector("div[class='item createNewTasks']")).click();
    	actitime.findElement(By.cssSelector("td[class='nameCell first']")).click();
    	actitime.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder']")).sendKeys("raman");
    	actitime.findElement(By.cssSelector("label[class='components_checkboxContainer checkboxContainer']")).click();; 
    	
    	
    	actitime.findElement(By.id("logoutLink")).click();
		actitime.close();
		
	*/
		
	}

}
