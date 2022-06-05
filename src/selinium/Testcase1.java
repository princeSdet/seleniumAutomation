package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("signup");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet124\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.nobroker.in/");
driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[1]/div")).click();
driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("8252863023");
driver.findElement(By.xpath("//*[@id=\"login-signup-form__name-input\"]")).sendKeys("prince");
driver.findElement(By.xpath("//input[@id='login-signup-form__email-input']")).sendKeys("princecps2@gmail.com");
driver.findElement(By.xpath("//*[@id=\"signUpSubmit\"]")).click();


	}

}
