package day01_Aug05;

import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_chrome {

	public static void main(String[] args) {
		
		String cd = System.getProperty("user.dir");
		String exepath = cd + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exepath);
		
		    ChromeDriver chrd= new ChromeDriver();
		    chrd.get("https://www.facebook.com");
		    String fbtitle = chrd.getTitle();
		    String cfbtitle = "Facebook – log in or sign up"; 
		    System.out.println("compairing Title: " + fbtitle.contains(cfbtitle));
		    String url = chrd.getCurrentUrl();
		    String pgsource = chrd.getPageSource();
		    String eurl= "https://www.facebook.com/";
		    System.out.println("compairing url: " + url.contains(eurl));
		    System.out.println("title length: " + fbtitle.length());
		    System.out.println("url length: " + url.length());
		    System.out.println("pagesource length: " + pgsource.length());
		    chrd.close();
	}

}
