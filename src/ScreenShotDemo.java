

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class ScreenShotDemo {
	
	//@nishikant Screenshot using "TakeScreenShot" Interface which is parent of RemoteWebDriver
	public void TakeScreenShotMethod() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Jars\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://testingshastra.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File file=driver.getScreenshotAs(OutputType.FILE);
		File out=new File("TakeScreenShot.jpeg");
		Files.copy(file, out);
	}
	public void screenShotUsingRobot() throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Jars\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testingshastra.com/");
		driver.manage().window().maximize();
		Robot robo=new Robot();
		Rectangle screenRect = new Rectangle();
		screenRect.setSize(1920, 1080);
		BufferedImage image=robo.createScreenCapture(screenRect);
		File output=new File("Screenshot1.jpeg");
		ImageIO.write(image,"jpeg", output);
	}
	public void screenShotUsingAShot() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","F:\\Jars\\Drivers\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://canarabank.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(20000);
		 AShot shot= new AShot();
		 Screenshot sc=shot.takeScreenshot(driver);
		 BufferedImage Image=sc.getImage();
		 File output=new File("AshotScreenShot.jpeg");
		 ImageIO.write(Image, "jpeg", output);
		 driver.quit();
	}
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		ScreenShotDemo d=new ScreenShotDemo();
		//d.TakeScreenShotMethod();//screen shot using takeScreenShot Interface
//		d.screenShotUsingRobot();//screenshot using using Robot class 
		d.screenShotUsingAShot();//ScreenShot using AShot Lib
	}
}
