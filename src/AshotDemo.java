import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class AshotDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
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
	 }
}
