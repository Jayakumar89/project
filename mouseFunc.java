package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseFunc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumRJtraining\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement des1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement src2= driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement des2= driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement src3= driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement des3= driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement src4= driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement des4= driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src1, des1).perform();
		a.dragAndDrop(src2, des2).perform();
		a.dragAndDrop(src3, des3).perform();
		a.dragAndDrop(src4, des4).perform();
		Thread.sleep(5000);
		driver.close();
	}

}
