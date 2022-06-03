import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.opera.OperaDriver;

public class FirstSelenium {
	// static ChromeDriver driver;

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Chrome Browser\n2.Firefox Browser\n3.Edge Browser\n4.Opera Browser\nEnter numberchoice which browser do you want to open:");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			System.setProperty("webdriver.chrome.driver", "F:\\Jars\\Drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			System.out.println("Opening Chrome browser");
			break;
		case 2:
			System.setProperty("webdriver.gecko.driver","F:\\Jars\\Drivers\\geckodriver.exe");
			WebDriver driver1=new FirefoxDriver();
			break;
		case 3:
			System.setProperty("webdriver.edge.driver","F:\\Jars\\Drivers\\msedgedriver.exe");
			WebDriver driver2=new EdgeDriver();
			break;
		case 4:
			System.setProperty("webdriver.opera.driver", "F:\\Jars\\Drivers\\operadriver.exe");
			WebDriver driver3= new OperaDriver();
		}	
	}

}
