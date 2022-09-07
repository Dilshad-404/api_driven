package day01_Aug05;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Assignment {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\DILSHAD\\Desktop\\software testing\\eclipse program\\Selenium_Basic\\Executable\\chromedriver.exe");	
    WebDriver wb = new ChromeDriver();
    wb.get("https://www.flipkart.com");
    String ptitle=wb.getTitle();
    String extitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
    System.out.println("Compairing title: " + ptitle.equals(extitle));
    String url = wb.getCurrentUrl();
    String exurl = "https://www.flipkart.com/";
    System.out.println("url compairing: " + url.contains(exurl));
    String pgs = wb.getPageSource();
    System.out.println("page source length: " +pgs.length());
    System.out.println("page title length: " +ptitle.length());
    wb.close();
 	}
}