import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroducereSelenium {

	public static void main(String[] args) {
		
        //Invoking Browser
		//chromedriver.exe -> Chrome browser
		System.setProperty(" webdriver.com.driver ", " C:\\Users\\casa_\\Downloads\\chromedriver-win64.zip\\chromedriver.exe ");
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("https://myelectrica.ro/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name ("email")).sendKeys("mail@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\":r1:\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"mui-p-8525-P-1\"]/div/form/div[2]/button")).click();
		
		//driver.close();
		
	    }

}
