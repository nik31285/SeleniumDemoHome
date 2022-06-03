import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Jars\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver","F:\\Jars\\Drivers\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://canarabank.com");
		driver.findElement(By.xpath("//a[text()='Banking']")).click();
	//	WebElement e=driver.findElement(By.xpath("//ul[@class=\"footer-service-list style-list-2\"]/descendant::a[text()='Online Banking']"));
		//e.wait(3000);
	//	e.click();
		
//		String s= driver.getWindowHandle();
//		System.out.println(s);
//		
//		String title=driver.getTitle();
//		System.out.println(title);
//		
//		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
//		driver.navigate().back();
	}

}
