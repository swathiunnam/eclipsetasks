package task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class PhpTravelsDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximise window
		driver.manage().window().maximize();
		//open  website
		driver.get("https://phptravels.com/demo/");
		//using implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='first_name'][@placeholder='Last Name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='last_name'][@placeholder='First Name']")).sendKeys("user");
		driver.findElement(By.xpath("//input[@name='business_name'][@placeholder='Business Name']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@name='email'][@placeholder='Email']")).sendKeys("Test@gmail.com");
		WebElement n1=driver.findElement(By.xpath("//span[@id='numb1']"));
		System.out.println(n1.getText());
		WebElement n2=driver.findElement(By.xpath("//span[@id='numb2']"));
		System.out.println(n2.getText());
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("C:\\Users\\swath\\Downloads\\Screenshots\\phpscreenshot.jpg"));
		
		//driver.findElement(By.xpath("//input[@id='number'][@placeholder='Result ?']")).sendKeys("n1+n2");
		//driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

}
