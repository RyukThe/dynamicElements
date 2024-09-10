package del;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class16 
{
	public static void main(String[] args) 
	{
		WebDriver m= new ChromeDriver();
		m.get("https://www.amazon.in/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		m.findElement(By.xpath("//input[contains(@id,'tw')]")).sendKeys("ipad 9th generation");
		m.findElement(By.xpath("//input[contains(@id,'submit-b')]")).click();
		String sd = m.findElement(By.xpath("((//div[@class='sg-row'])[1]//span)[18]")).getText();
		System.out.println(sd);
	}

}
