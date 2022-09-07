package day01_Aug05;

import org.openqa.selenium.chrome.ChromeDriver;

public class CromeOpen_Browser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
                     "C:\\Users\\DILSHAD\\Desktop\\software testing\\eclipse program\\Selenium_Basic\\Executable\\chromedriver.exe");	
     ChromeDriver crdr = new ChromeDriver();
     crdr.get("https://www.flipkart.com");
     crdr.close();
	}

}
