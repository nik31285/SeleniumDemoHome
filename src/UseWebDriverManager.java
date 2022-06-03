import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



//you must have to add webdrivermanager jar by downloading from mvnrepository.com site
//configure it by right click on project--properties--javabuildpath--libraries--addExternal jars
public class UseWebDriverManager {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
    	RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.0.3");
	}
}
