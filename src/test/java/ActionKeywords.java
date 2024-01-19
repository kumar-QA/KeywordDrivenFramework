import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	WebDriver driver;
	void OpenBrowser() {
		driver=new ChromeDriver();
	}
	void EnterUrl() {
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	
	void EnterUserName() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
      
	}
	void EnterPassword() {
		  driver.findElement(By.name("Password")).clear();
			driver.findElement(By.name("Password")).sendKeys("admin");
	}
	void clickOnLogin() {
		driver.findElement(By.className("login-button")).click();
	}
	
	void clickonLogout() {
		driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
	}
	
	void closeBrowser() {
		driver.close();
	}
}
