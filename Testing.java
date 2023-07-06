package org.automationwebsite;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class Testing {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kanibalaji16@gmail.com");
        driver.findElement(By.xpath("//img[@id='enterimg']")).click();
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("kani");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("mozhi");
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("No.153/55,old mambalam road,saidapet,chennai-15");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("kanibalaji16@gmail.com");
        driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("8610913730");
        driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[2]")).click();
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		WebElement Cricket=driver.findElement(By.id("checkbox1"));
		Cricket.click();
		WebElement Hockey=driver.findElement(By.id("checkbox3"));
		Hockey.click();
		Hockey.click();
		Cricket.click();
		Cricket.click();
		WebElement skills=driver.findElement(By.id("Skills"));
		Select myskills=new Select(skills);
		myskills.selectByValue("Java");
		WebElement countries=driver.findElement(By.id("countries"));
		Select mycountries=new Select(countries);
		WebElement dropdown=driver.findElement(By.id("yearbox"));
		WebElement dropdown1=driver.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/select[1]"));
		WebElement dropdown2=driver.findElement(By.id("daybox"));
		Select dd=new Select(dropdown);
		Select dd1=new Select(dropdown1);
		Select dd2=new Select(dropdown2);
		dd.selectByValue("1995");
		dd1.selectByValue("December");
		dd2.selectByValue("26");
		driver.findElement(By.xpath(" //input[@id='imagesrc']")).sendKeys("C:\\Users\\BALAJI S\\Desktop\\image");
		driver.findElement(By.id("firstpassword")).sendKeys("mahisha28");
		driver.findElement(By.id("secondpassword")).sendKeys("mahisha28");
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		File src1=srcshot.getScreenshotAs(OutputType.FILE);
		File des1=new File("\"C:\\org.automationwebsite\\snap\"");
        FileUtils.copyDirectory(src1, des1);
	    driver.findElement(By.xpath("//button[@id='submitbtn']\"")).click();
	    driver.quit();
		
		
		
       
        
        
        
        
        
		
	}

}
