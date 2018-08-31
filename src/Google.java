import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumSetup\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
				
	}

}
