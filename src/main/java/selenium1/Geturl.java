package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\soni\\Desktop\\velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		String url=driver.getCurrentUrl();
		System.out.println("Current url is"+url);

	}

}
// i made this changes