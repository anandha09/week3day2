package ajio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajioassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		//driver.findElement(By.xpath("//button(@type='submit')/span")).click()
		driver.findElement(By.className("ic-search")).click();
		//driver.findElement(By.id("Men")).click();
		driver.findElement(By.xpath("//label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(@for,'Men - Fashion Bags')]")).click();
		Thread.sleep(2000);
		String attribute = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(attribute);
	List<WebElement> listofbags = driver.findElements(By.className("brand"));
		for (WebElement webElement : listofbags) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		List<WebElement> listofbagsnames = driver.findElements(By.className("nameCls"));
		for (WebElement webElement : listofbagsnames) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

}
