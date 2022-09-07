package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
                ".\\Executable\\chromedriver.exe");	
    WebDriver cb = new ChromeDriver();
    cb.get("https://www.amazon.in");
    cb.manage().window().maximize();
    String ptitle=cb.getTitle();
    String extitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    System.out.println("page title: "+ ptitle);
    System.out.println("Compairing title: " + ptitle.equals(extitle));
    String url = cb.getCurrentUrl();
    String exurl = "https://www.amazon.in/";
    System.out.println("url compairing: " + url.contains(exurl));
    String pgs = cb.getPageSource();
    System.out.println("page title length: " +ptitle.length());
    System.out.println("page source length: "+pgs.length());
    Thread.sleep(3000);
    cb.findElement(By.cssSelector("a[href='/gp/sva/dashboard?ref_=nav_cs_apay\']")).click();
    System.out.println("page title is: "+cb.getTitle());
    cb.navigate().back();
    String title = cb.getTitle();
    System.out.println("tilte validation: "+title);
    
    cb.close();
		
		
		
	}

}
