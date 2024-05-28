package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDemo {
	
	public void dragAndDrop(WebDriver driver) {
		
		Actions action = new Actions(driver);
		//switching to iframe
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		  driver.switchTo().frame(frameElement);
		    //drag the source element
	         WebElement source=driver.findElement(By.id("draggable"));
		    //drop the source to destination
				WebElement destination=driver.findElement(By.id("droppable"));
				action.dragAndDrop(source, destination).build().perform();
				System.out.println("The souurce element has "+destination.getText());
				
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//open guvi website
		driver.navigate().to("https://jqueryui.com/droppable/");
		//maximise browser window
		driver.manage().window().maximize();
		 JqueryDemo jdemo=new  JqueryDemo();
		 jdemo.dragAndDrop(driver);
		
		
		
	}

}
