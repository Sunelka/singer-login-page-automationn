package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Page {

	public static void main(String[] args) throws InterruptedException {
		// Set up ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();

		// Open Sauce Demo website
		driver.get("https://www.singersl.com/");

		// Maximize browser
		driver.manage().window().maximize();

		// current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// Get Title
		String Title = driver.getTitle();
		System.out.println("Title of the web" + Title);

		
		Thread.sleep(20000);
		
		// Close popup window
		driver.findElement(By.xpath("/html/body/div[4]/div/a[1]")).click();

		// Click on login button
		driver.findElement(By.xpath("//*[@id=\"block-singer-account-menu\"]/ul/li[2]/a")).click();

		// Find user name element and send
		
		String username = "sunelkak19@gmail.com";
		
		WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		usernameInput.sendKeys(username);
		System.out.println("User name : " + username);

		// Find user password element and send
		
		String password = "123456789";
		
		WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		passwordInput.sendKeys(password);
		System.out.println("Password :" + password);

		
		//Click login button
		WebElement currenturl = driver.findElement(By.xpath("//*[@id=\"login-submit\"]"));
		currenturl.click();
//		String curl = driver.getCurrentUrl();
//		System.out.println("Current URL :" + curl);
		
		System.out.println("User successfully sign in");
		
		// Close the browser window
		driver.quit();

	}

}
