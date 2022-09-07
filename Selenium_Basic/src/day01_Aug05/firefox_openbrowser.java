package day01_Aug05;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_openbrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
	                     "\\Executable\\firefoxdriver.exe");	
	     FirefoxDriver frdr = new FirefoxDriver();
	     frdr.get("https://www.amazon.com");
	     frdr.close();
}
}