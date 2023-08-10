package a2_bingTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_SampleBing {
@Test
public void  loginGoogleTest() throws IOException{
	WebDriverManager.chromedriver().setup();
	WebDriver wd=new ChromeDriver();
	wd.get("https://www.bing.com/");
	System.out.println(wd.getTitle());
	 WebElement element=wd.findElement(By.name("q"));
	 element.sendKeys("Chennai");
	 element.submit();
	 System.out.println(wd.getTitle());
	 wd.navigate().back();
	 System.out.println(wd.getTitle());
	 wd.navigate().forward();
	 System.out.println(wd.getTitle());
	 File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C:/Vcentry/Batch264/K3_GitTest/ScreenShot/bing.png"));
	 wd.quit();
	 
	 
}
}
