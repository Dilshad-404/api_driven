package day01_Aug05;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tricentis {

	public static void main(String[] args) {
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		ChromeDriver tri = new ChromeDriver();
		tri.get("https://www.tricentis.com");
		String url =tri.getCurrentUrl();
		String curl = "https://www.tricentis.com/";
		String gt = tri.getTitle();
		String ct = "Automated Software Testing Tools | Tricentis";
		System.out.println("compairing title: " + gt.contains(ct));
		System.out.println("compairing url: " + url.contains(curl));
		String pgs = tri.getPageSource();
		System.out.println("page source length: " + pgs.length());
		tri.close();

	}

}
