package day01_Aug05;

import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM {

	public static void main(String[] args) {
		String hrm = System.getProperty("user.dir");
		String path = hrm + "\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		ChromeDriver hrms = new ChromeDriver();
		hrms.get("https://opensource-demo.orangehrmlive.com");
		String url ="https://opensource-demo.orangehrmlive.com/";
		String curl = hrms.getCurrentUrl();
		String gt = hrms.getTitle();
		String ct = "OrangeHRM";
		System.out.println("compairing title: " + gt.contains(ct));
		System.out.println("compairing url: " + url.contains(curl));
		String pgs = hrms.getPageSource();
		System.out.println("page source length: " + pgs.length());
		hrms.close();

	}

}
