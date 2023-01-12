package JavaMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmaoznTest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String title = driver.findElement(By.xpath("//span[text()='1-48 of over 40,000 results for']")).getText();
		String title1 = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']")).getText();
		System.out.println(title);
		System.out.println(title1);
		//driver.findElement(By.xpath("(((//div[contains(@class,'a-checkbox a-checkbox-fancy')]/following-sibling::span)[3]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]/following-sibling::span)[3]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'a-checkbox a-checkbox-fancy')]/following-sibling::span)[2]")).click();
		String title2 = driver.findElement(By.xpath("//div[contains(@class,'a-section a-spacing-small')]//span")).getText();
		System.out.println(title2);
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.linkText("Price: High to Low")).click();
		String result = driver.findElement(By.xpath("(//span[text()='Generic'])[2]")).getText();
		System.out.println(result);
		String price = driver.findElement(By.xpath("//span[text()='14,828']")).getText();
		System.out.println(price);
		
				
		
		//driver.findElement(By.xpath("(//span[@data-action='a-dropdown-button'])[2]")).click();
	}

}
