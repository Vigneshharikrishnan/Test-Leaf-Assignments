package week1.day1;

import org.openqa.selenium.chrome.ChromeDriverLogLevel;

public class Browser {

	public static void main(String[] args) {
		ChromeDriverLogLevel driver = new ChromeDriver();
		//System.out.println("This is my Browser");
		driver.get("www.google.com");
	}

}
