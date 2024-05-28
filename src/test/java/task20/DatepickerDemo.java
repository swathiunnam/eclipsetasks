package task20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open google
		driver.get("https://jqueryui.com/datepicker/");
		//switch to frame
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String year="2024";
		String month="June";
		String date="22";
		Thread.sleep(1000);
		while(true) {
	    String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		if(currentmonth.equals(month)&& currentyear.equals(year))
		{
		 break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		//select date
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		for(WebElement dt:alldates) {
			if(dt.getText().equals(date)) {
				
						dt.click();
						break;
			}
		}
		Thread.sleep(1000);
		String text= driver.findElement(By.xpath("//input[@id='datepicker']")).getText();
		System.out.println("date is:"+text);
		driver.quit();
	}

}
