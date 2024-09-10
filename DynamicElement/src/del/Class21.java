package del;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class21 
{
	public static void main(String[] args) 
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.amazon.in/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 m.findElement(By.xpath("//input[contains(@id,'tw')]")).sendKeys("ipad 9th generation");
		WebElement se = m.findElement(By.xpath("//input[contains(@id,'submit-b')]"));
		Actions l= new Actions(m);
		l.click(se).perform();
	
		
		WebElement sd = m.findElement(By.xpath("(((//div[@class='sg-row'])[9])//span)[6]"));
		
		
		l.moveToElement(sd).perform();
		
		System.out.println(sd.getText());
		
	}

}
