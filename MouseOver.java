package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumRJtraining\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement alldep = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		WebElement paint = driver.findElement(By.xpath("(//a[@data-link='//www.homedepot.com/b/Paint-Ideas'])[1]"));
		WebElement intpaint = driver.findElement(By.xpath("//a[@title='Interior Paint']"));
		WebElement ceilpaint = driver.findElement(By.xpath("//a[@title='Ceiling Paint']"));
		Actions q=new Actions(driver);
		q.moveToElement(alldep).perform();
		q.moveToElement(paint).perform();
		q.moveToElement(intpaint).perform();
		ceilpaint.click();
		
	}
}
