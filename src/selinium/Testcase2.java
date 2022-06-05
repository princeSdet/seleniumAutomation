package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Buy");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet124\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div[3]")).click();
		
	}

}
