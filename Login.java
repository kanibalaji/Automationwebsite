package org.testngproject;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
//round trip

public class Login extends Lunchbrowser {
	@Test(groups="Regression")
	public void loginApp() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.ixigo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//from to
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/nav/span[2]/span")).click();	
		WebElement From=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[1]/div/div[1]/input"));
		From.clear();
		From.sendKeys("DEL");
		Thread.sleep(3000);
		From.sendKeys(Keys.ENTER);
		WebElement To=driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[5]/div[1]/d"));
		To.clear();
		To.sendKeys("RUN");
		Thread.sleep(2000);
		//start date and return date
		driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[5]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/div[1]")).click();
		driver.findElement(By.xpath(" //body/div[@id='content']/div[1]/div[1]/div[5]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/input[1]")).click();
		//No of passenger
		
		driver.findElement(By.xpath("//input[@id='passenger-list']")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[2]/div[1]/div[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[2]/div[2]/div[2]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[5]/div/div[2]/div[2]/div[3]/div[2]/span[2]")).click();
		WebElement Business=driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[2]/div[4]/span[1]/div[2]/span[1]"));
		Business.click();
		driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[5]/div[1]/div[1]/div[6]/button[1]/div[1]")).click();
		//check flights
		WebElement CheckBox2=driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div/div[2]/div/div[1]/div[1]/div/div[2]/div[1]/span/div[3]/span[1]/span"));
		CheckBox2.clear();
		WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[1]/div[3]/div/div[2]/span/div[1]/span[1]/span"));
		checkbox1.click();
		////Screenshot
		TakesScreenshot srcshot2=(TakesScreenshot)driver;
		File src2=srcshot2.getScreenshotAs(OutputType.FILE);
		File des2=new File("\"C:\\Users\\BALAJI S\\Desktop\\screenshot2\"");
		FileHandler.copy(src2, des2);
		
	}

}
