package OpenURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openURL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniu Driver\\Chrome 118\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Test  case Pass");
		driver.quit();

	}

}
