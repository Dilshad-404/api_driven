package day01_Aug05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\DILSHAD\\Desktop\\software testing\\eclipse program\\Selenium_Basic\\Executable\\chromedriver.exe");	
    WebDriver cb = new ChromeDriver();
    cb.get("https://www.amazon.in");
    String ptitle=cb.getTitle();
    String extitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    System.out.println("Compairing title: " + ptitle.equals(extitle));
    String url = cb.getCurrentUrl();
    String exurl = "https://www.amazon.in/";
    System.out.println("url compairing: " + url.contains(exurl));
    String pgs = cb.getPageSource();
    System.out.println("page title length: " +ptitle.length());
    System.out.println("page source length: "+pgs.length());
    cb.close();
		
		
		
	}

}
