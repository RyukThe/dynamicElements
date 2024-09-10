package del;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class17
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.amazon.in/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		m.findElement(By.xpath("//input[contains(@id,'tw')]")).sendKeys("apple watch se");
		m.findElement(By.xpath("//input[contains(@id,'submit-b')]")).click();
		String sd = m.findElement(By.xpath("(((//div[@class='sg-row'])[9])//span)[8]")).getText();
		System.out.println(sd);
	}

}
