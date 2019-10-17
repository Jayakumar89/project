package SeleniumAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winhand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumRJtraining\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone 7");
		driver.findElement(By.xpath("//div[@class='topBar  top-bar-homepage  top-freeze-reference-point']")).click();
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		driver.findElement(By.xpath("(//img[@title='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[1]")).click();
		String pwind=driver.getWindowHandle();
		System.out.println(pwind);
		Set<String> allwind = driver.getWindowHandles();
		for (String x: allwind) {
			if(!(pwind.equals(x))) {
				driver.switchTo().window(x);
				driver.findElement(By.xpath("(//span[@class='intialtext'])[2]")).click();
			}
		}
			
	}

}
