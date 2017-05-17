package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "E://Selenium//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://www.apple.com");
		

		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".ac-gn-link.ac-gn-link-watch")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='main']/section[1]/div/p/a[2]")).click();
		

		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='page']/div[6]/div[3]/div/div[2]/div/div/div[3]/store-provider/grid-page/wuip-grid/ul/li[1]/div/div[3]/form/button")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='Item138mm']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='Item3series2']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='primary']/div[4]/div[1]/div[1]/div/div[1]/div/form/div/span/button")).click();
		
		
	}
	
	

}
