package newpackage;

//import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tej {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/Users/anushruthasukumar/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	//write the above two lines of code with the path of different browser (for multiple browser access)
	
	driver.manage().window().maximize();
	String appUrl = "http://todomvc.com/";
	driver.get(appUrl);
	
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/iron-pages/div[1]/ul/li[2]/a")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/header/form/input")).clear();
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/header/form/input")).click();
	driver.findElement(By.xpath("/html/body/ng-view/section/header/form/input")).sendKeys("Hello world");
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/header/form/input")).sendKeys(Keys.ENTER);
	Thread.sleep(500);
	
	//driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/label")).click();
	//driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/label")).click();
	Actions act = new Actions(driver);
	act.doubleClick(driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/label"))).build().perform();
	//Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/form/input")).clear();
	driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/form/input")).sendKeys(" Hello world edited");
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/form/input")).sendKeys(Keys.ENTER);
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/input")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/input")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/header/form/input")).sendKeys("selenium");
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/header/form/input")).sendKeys(Keys.ENTER);
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[2]/div/input")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/input")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("/html/body/ng-view/section/footer/ul/li[3]/a")).click();
	Thread.sleep(500);

	Actions action = new Actions(driver);
	WebElement we = driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/button"));
	action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/button"))).click().build().perform();	
	//driver.findElement(By.xpath("/html/body/ng-view/section/section/ul/li[1]/div/button")).click();
	System.out.println("I can clear a single To-do item from the list completely by clicking the Close icon");
	driver.findElement(By.xpath("/html/body/ng-view/section/footer/button")).click();
	Thread.sleep(500);
	System.out.println("I can clear all completed To-do items from the list completely");
	driver.findElement(By.xpath("/html/body/ng-view/section/footer/button")).click();
	Thread.sleep(500);
	driver.close();
	
	
}
}