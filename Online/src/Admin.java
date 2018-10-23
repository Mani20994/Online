import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Admin {
	@Test
	public void create_restaurant() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.demo.iscripts.com/netmenus/mrml/admin");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		    
			//email
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
			//Password
			driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("admin");
			//button
			driver.findElement(By.xpath("//button[@value='submit']")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			
			//Restaurant details
			//restaurant
			driver.findElement(By.xpath("//a[@href='https://www.demo.iscripts.com/netmenus/mrml/cms?section=restaurant']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Scroll down
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(200,500)");
			System.out.println("scrolled Down");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		

			//Add Record
			driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
			
			//Scroll down
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("window.scrollBy(300,500)");
			System.out.println("scrolled Down");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
			//restaurant
			driver.findElement(By.xpath("//input[@id='venue_name']")).sendKeys("Brew Point");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Description
			driver.findElement(By.xpath("//textarea[@id='venue_description']")).sendKeys("Description");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Address
			driver.findElement(By.xpath("//input[@id='venue_address_by_user']")).sendKeys("Kalburagi");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Zip
			driver.findElement(By.xpath("//input[@id='zip_code']")).sendKeys("585102");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Phone
			driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9876543210");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Site URL
			driver.findElement(By.xpath("//input[@id='site_url']")).sendKeys("http://www.brewpoint.com");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Slogan
			driver.findElement(By.xpath("//input[@id='slogan']")).sendKeys("Coffee cafe");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Cuisines
			driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Chinese");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Payment Option
			driver.findElement(By.xpath("//input[@value='0']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Take out
			driver.findElement(By.xpath("//input[@id='takout']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Home Delivery
			driver.findElement(By.xpath("//input[@id='delivery']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Reservation
			driver.findElement(By.xpath("//input[@id='reservation']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Catering
			driver.findElement(By.xpath("//input[@id='catering']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Restaurant Owner
			driver.findElement(By.xpath("//select[@id='created_by']")).click();
			driver.findElement(By.xpath("//select[@id='created_by']/option[3]")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
			//Manager
			driver.findElement(By.xpath("//input[@id='store_manager']")).sendKeys("Robert$$");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Manager Email
			driver.findElement(By.xpath("//input[@id='store_manager_email']")).sendKeys("Rbrt$$@gmail.com");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Minimum Order Amoount
			driver.findElement(By.xpath("//input[@id='min_order_amount']")).sendKeys("1000");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Sales Tax(%)
			driver.findElement(By.xpath("//input[@id='sales_tax']")).sendKeys("1");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Delivery Fee Type
			driver.findElement(By.xpath("//select[@id='delivery_fee_type']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Delivery Fee(%)
			driver.findElement(By.xpath("//input[@id='delivery_fee']")).sendKeys("50");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Delivery Area Desc
			driver.findElement(By.xpath("//textarea[@id='delivery_area_desc']")).sendKeys("Description");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Rate of commission(%)
			driver.findElement(By.xpath("//input[@id='commission']")).sendKeys("2");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Meta Tags(Keywords in comma)
			driver.findElement(By.xpath("//textarea[@id='meta_tags']")).sendKeys("This is meta tags");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			//Save
			driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			//Publish
			driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
			
			//Restaurant Images
			driver.findElement(By.xpath("//tr[@id='jqRecord_43']//td[5]")).click();
			
			//Add Record
			driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
			
			WebElement upload=driver.findElement(By.xpath("//input[@id='photo_id']"));
			upload.sendKeys("E:\\Restraunts _images");
			driver.findElement(By.xpath("//input[@id='is_cover_photo']")).click();
			driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
			
			//Menu
			driver.findElement(By.xpath("//tr[@id='jqRecord_33']//td[6]")).click();
			
			//Add Record
			driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
			
			
			//Add Menu
			
			//Menu
			driver.findElement(By.xpath("//input[@id='class_name']")).sendKeys("Breakfast");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			//Start Time
			driver.findElement(By.xpath("//select[@id='start_time']")).click();
			driver.findElement(By.xpath("//select[@id='start_time']/option[18]")).click();
			
			//End Time
			driver.findElement(By.xpath("//select[@id='end_time']")).click();
			driver.findElement(By.xpath("//select[@id='end_time']/option[20]")).click();
			
			//Save
			driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
			
			//Publish
			driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
			
			//Orders
			driver.findElement(By.xpath("//tr[@id='jqRecord_33']//td[7]")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			//Food Items
			driver.findElement(By.xpath("//tr[@id='jqRecord_33']//td[8]")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			//Add Food Item
			driver.findElement(By.xpath("//a[@id='additem']")).click();
			
			//Food Item
			driver.findElement(By.xpath("//input[@id='activities_id']")).sendKeys("Idli");
			
			//Food Item Type
			driver.findElement(By.xpath("//input[@id='main']")).click();
			
			//Food Description
			driver.findElement(By.xpath("//textarea[contains(@placeholder,'Food Item Description*')]")).sendKeys("South Indian Breakfast");
			
			//Add to Menu
			driver.findElement(By.xpath("//a[contains(text(),'here')]")).click();
			
			//Food Item Price
			
			//Multiple Price
			driver.findElement(By.xpath("//input[@id='price_option']")).click();
			
			//Size
			driver.findElement(By.xpath("//input[@id='activity_size1']")).sendKeys("Small");
			
			//Price
			driver.findElement(By.xpath("//input[@id='activity_price1']")).sendKeys("$50");
			
		
			//Discount Type
			driver.findElement(By.xpath("//select[@id='activity_discount_type']")).click();
			driver.findElement(By.xpath("//select[@id='activity_discount_type']/option[2]")).click();
			driver.findElement(By.xpath("//input[@id='activity_discount']")).sendKeys("$5");
			
			
			//Food Category
			driver.findElement(By.xpath("//div[@class='controls']//ul[@class='token-input-list-facebook']")).click();
			//driver.findElement(By.xpath("//input[@id='token-input-food_category']")).sendKeys("Burger");
			driver.findElement(By.xpath("//li[@class='token-input-token-facebook']")).click();
			
			//Save
			driver.findElement(By.xpath("//input[@value='Save']")).click();
			
			
		
			
			
	}
}
			