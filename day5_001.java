package com.example.bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_001 {
public static void  main ( String args[])throws InterruptedException  {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		String url="https://j2store.net/free/";
		driver.navigate().to(url);
		String pageTitle=driver.getTitle();
		if(pageTitle.equals("Home"))
			System.out.print("true");
		else
			System.out.print("false");
		
		Thread.sleep(3000);
		driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
		pageTitle = driver.getTitle();
		if (pageTitle.equals("Shop")) {
		    System.out.println("Title is validated");
		} else {
		    System.out.println("Title validation failed!");
		}
		driver.quit();

}
}