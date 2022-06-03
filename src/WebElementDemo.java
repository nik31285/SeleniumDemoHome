import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Jars\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=\"Sign in\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("nishan3d@gmail.com");
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
	
	}

}
