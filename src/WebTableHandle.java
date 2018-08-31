import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\SeleniumSetup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		List<WebElement>rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Totle rows in web table : " + rowCount);		
		
		String beforeXpath = "//*[@id=\'customers\']/tbody/tr[";
		String afterXpaht ="]/td[1]";

		for (int i=2; i<=7;i++) {
			
			String actualxpath = beforeXpath+i+afterXpaht;
			
			WebElement element = driver.findElement(By.xpath(actualxpath));
			
			System.out.println(element.getText());
			
				if(element.getText().equals("Laughing Bacchus Winecellars")) {
					System.out.println("company name : "+ element.getText()+" is found" + " at position :" + (i-1));
					break;
				}
					
			
		}
		
		System.out.println("*************");
		
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		String afterXpathContact ="]/td[2]";
		for (int i=2; i<=7;i++) {
			
			String actualxpath = beforeXpath+i+afterXpathContact;
			
			WebElement element = driver.findElement(By.xpath(actualxpath));
			
			System.out.println(element.getText());
			
		}
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
			
		System.out.println("*********");
		String afterXpathCountry = "]/td[3]";
		for (int i=2; i <=7; i++) {
			String actualXpath = beforeXpath + i + afterXpathCountry;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			
			
		}
		
		
	
	
	//hanndle  webtable coulmns:
	
	//*[@id="customers"]/tbody/tr[1]/th[1]
	//*[@id="customers"]/tbody/tr[1]/th[2]
	//*[@id="customers"]/tbody/tr[1]/th[3]
	
	
	String colBeforeXpath = "//*[@id=\'customers\']/tbody/tr[1]/th[";
	String colAfterXpath = "]";
	List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\'customers\']/tbody/tr[1]/th"));
	
	int colCount = cols.size();
	System.out.println("Total number of colums are :" + colCount);
	
	
	
	
	
	
	}

}
	
	
	
	
		




