package JavaMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@data-no='1']")).click();
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@data-id='122']")).click();
		driver.findElement(By.xpath("//td[text()='13']")).click();
		driver.findElement(By.xpath("//button[@class='fl button']")).click();
		String fb = driver.findElement(By.xpath("//span[text()='102']")).getText();
		System.out.println(fb);
		driver.findElement(By.xpath("(//label[@for='bt_SLEEPER'])[2]")).click();
		String sb = driver.findElement(By.xpath("(//div[contains(@class,'travels lh-24')])[2]")).getText();
		System.out.println(sb);
		driver.findElement(By.xpath("(//div[contains(@class,'button view-seats')])[2]")).click();
		String as = driver.findElement(By.xpath("(//div[@class='seat-left m-top-30'])[2]")).getText();
		System.out.println(as);
		

	}

}
