package shopcomm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShopTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arash\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://demo.nopcommerce.com/");
		WebElement Curr = dr.findElement(By.xpath("//*[@id=\"customerCurrency\"]"));
		Select Currency = new Select(Curr);
		Currency.selectByVisibleText("Euro");
		dr.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"gender\"]/span[1]/label")).click();
		dr.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Rahul");
		dr.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Sharma");
		WebElement DOB = dr.findElement(
				By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));
		Select Date = new Select(DOB);
		Date.selectByValue("10");
		WebElement DOB1 = dr.findElement(
				By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
		Select Month = new Select(DOB1);
		Month.selectByIndex(4);
		WebElement DOB2 = dr.findElement(
				By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));

		Select Year = new Select(DOB2);
		Year.selectByVisibleText("1993");
		dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("Rahulsharma@gmail.com");
		dr.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("Steel Works");
		dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Sharma@123");
		dr.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Sharma@123");
		dr.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		WebElement Confirm = dr.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
		Confirm.isEnabled();
		System.out.println(Confirm.isEnabled());

	}



	}


