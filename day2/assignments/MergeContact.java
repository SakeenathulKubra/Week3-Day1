package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
	System.out.println(title);
	WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.xpath("//a[text()='Contacts']")).click();
driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
Set<String> windowhandle1 = driver.getWindowHandles();
System.out.println(windowhandle1);
List<String> list = new ArrayList <String>(windowhandle1);
String string = list.get(1);
driver.switchTo().window(string);
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
driver.switchTo().window(list.get(0));
String title2 = driver.getTitle();
System.out.println(title2);
driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
Set<String> windowHandles = driver.getWindowHandles();
System.out.println(windowHandles);
List<String> handle = new ArrayList<String>(windowHandles);
driver.switchTo().window(handle.get(1));
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
driver.switchTo().window(handle.get(0));
driver.findElement(By.xpath("//a[text()='Merge']")).click();
Alert alert = driver.switchTo().alert();
alert.accept();



	}

}
