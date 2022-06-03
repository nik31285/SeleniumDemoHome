import java.awt.AWTException;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Robot Class: Suitable for keyboard Action
//Robot Class present inside java.awt package(abstract window toolkeet)
//Robot class usefull outside browser

public class RobotDemo {
	public WebDriver driver;
	public void applicationLauncher() {
		System.setProperty("webdriver.chrome.driver", "F:\\Jars\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://testingshastra.com/");
		driver.manage().window().maximize();
	}
	public void keyBoardEvent() throws AWTException, InterruptedException {
		applicationLauncher();
		Robot robo=new Robot();
		for(int i=0;i<5;i++) {
			robo.keyPress(KeyEvent.VK_TAB);
			robo.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(1000);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
	}
	public void hoverUsingRobot() throws AWTException {
		applicationLauncher(); 
		Robot robo=new Robot();
	}
	private void screenshotUsingRobot() throws AWTException, IOException {
		applicationLauncher();
		Robot robo=new Robot();
		Rectangle rect=new Rectangle();
		rect.setSize(1920, 1080);
		BufferedImage image=robo.createScreenCapture(rect);
		File outputFile=new File("screenShot.jpg");
		ImageIO.write(image,"jpg",outputFile);
	}
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		RobotDemo d=new RobotDemo();
	//	d.keyBoardEvent();//press and release TAB 5 times and click on instagram icon
		d.screenshotUsingRobot();//capture screenshot using Robot class
	}

}
