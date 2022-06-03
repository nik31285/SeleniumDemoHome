package actiondemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Useofwebmanager {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.chromedriver().setup();
		WebDriver d=new FirefoxDriver();
		d.get("www.testingshastra.com");
	}
}
