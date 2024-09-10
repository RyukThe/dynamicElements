package del;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class15 
{
	public static void main(String[] args)
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.amazon.in/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.findElement(By.xpath("//input[contains(@id,'tw')]")).sendKeys("oneplus 10 pro");
		m.findElement(By.xpath("//input[contains(@id,'submit-b')]")).click();
		String s = m.findElement(By.xpath("((//div[@class='sg-row'])//span)[23]")).getText();
		
		
		System.out.println(s);
		
	}
}
