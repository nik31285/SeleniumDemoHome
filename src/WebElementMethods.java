import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	public WebDriver driver;
	public void lanchApplication(){
		System.setProperty("webdriver.chrome.driver","F:\\Jars\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e;
	}
	public void sendKeysDetail() {
		lanchApplication();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(Keys.SHIFT,"Nishikant");
	}
	public void getAttributeDemo() {
		lanchApplication();
		String AttributeName=driver.findElement(By.xpath("//input[@type=\"text\"]")).getAttribute("type");
		System.out.println(AttributeName);//return Value of type Attribute
	}
	public void getSizeDemo() {
		lanchApplication();
		int height=driver.findElement(By.xpath("//input[@type=\"text\"]")).getSize().height;
		int width=driver.findElement(By.xpath("//input[@type=\"text\"]")).getSize().width;
		System.out.println("Height="+height+"  "+"Width="+width);
	}
	public void isEnableMethod() {
		lanchApplication();
		boolean value=driver.findElement(By.xpath("//input[@type=\"text\"]")).isEnabled();
		System.out.println(value);
	}
	public void isDisplayMethod() {
		lanchApplication();
		boolean value=driver.findElement(By.xpath("//button[@name=\"login\"]")).isDisplayed();
		System.out.println(value);
	}
	 public void getCssValueMethod() {
		 lanchApplication();
		 String buttonColor=driver.findElement(By.xpath("//button[@name=\"login\"]")).getCssValue("background-color");
		 //.getCssValue("Property"); "Property"="background-color","font","border"
		 System.out.println("login button color is: "+buttonColor);
	}
	 public void getLocationMethod() {
		 lanchApplication();
		 Point p=driver.findElement(By.xpath("//button[@name=\"login\"]")).getLocation();
		 System.out.println("X and Y coordinates are:"+p.x+","+p.y);
		 System.out.println(p.toString());//return coordinates
		 driver.close();
	 }
	 public void getRectMethod() {
		 lanchApplication();
		 Rectangle r=driver.findElement(By.xpath("//button[@name=\"login\"]")).getRect();
		 System.out.println(r.getPoint().toString());
		 System.out.println(r.getDimension().toString());
	 }
	 public void getTextMethod() {
		 lanchApplication();
		 String TextName=driver.findElement(By.xpath("//button[@name=\"login\"]")).getText();
		 System.out.println(TextName);
	 }
	public static void main(String[] args) {
		WebElementMethods a=new WebElementMethods();
		//a.sendKeysDetail();
		//a.getAttributeDemo();
		//a.getSizeDemo();
		//a.isEnableMethod();//check TextBox or button is usable or not
		//a.isDisplayMethod();//check whether button or textBox is display or not
		//a.getCssValueMethod();
		//a.getLocationMethod();
		//a.getRectMethod();
		//a.getTextMethod();
	}
}
