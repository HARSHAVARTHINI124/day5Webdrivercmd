package com.example.bike;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
public class day5_003 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://j2store.net/free/");
	    Thread.sleep(5000);
	    driver.get("https://j2store.net/free/index.php/shop?filter_catid=11");
	    List<WebElement> itemElements = driver.findElements(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]"));
	    for(int i = 0; i< itemElements.size(); i++) {
	     String s = itemElements.get(i).getText();
	     System.out.println(s);
	     driver.quit();
	        }
	    }
}
