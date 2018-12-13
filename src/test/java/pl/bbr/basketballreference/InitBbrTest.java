package pl.bbr.basketballreference;

import java.awt.Font;
import java.awt.Window;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitBbrTest {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Michał\\Desktop\\Java\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.get("http://basketball-reference.com");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		/*WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		InitBbrTest.sleep(90);
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("GryMich");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("bober3000");
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/div[2]/input")); //tutaj miałem problem ze ścieżką xpath - sprawę koplikował cudzysłów w "login", ale wstawiając przed nimi \ java czyta xpath prawidłowo
		loginbutton.click();*/
		WebElement search = driver.findElement(By.name("search"));
		search.click();
		search.sendKeys("LeBron James");
	   	WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/form/input[1]"));
		searchButton.click();
		js.executeScript("window.scrollBy(0,750)"); //scrolluje o konkretną wartość
		//js.executeScript("arguments[0].scrollIntoView();", "//*[@id=\"per_game\"]/thead/tr/th[30]"); // to ma niby scrollować do elementu, ale nie działa
		WebElement ptsPerG = driver.findElement(By.xpath("//*[@id=\"per_game\"]/thead/tr/th[30]"));
		ptsPerG.click();
		WebElement pfPerG = driver.findElement(By.xpath("//*[@id=\"per_game\"]/thead/tr/th[29]"));
		pfPerG.click();
		WebElement tovPerG = driver.findElement(By.xpath("//*[@id=\"per_game\"]/thead/tr/th[28]"));
		tovPerG.click();
		WebElement blockPerG = driver.findElement(By.xpath("//*[@id=\"per_game\"]/thead/tr/th[27]"));
		blockPerG.click();
		WebElement stlPerG = driver.findElement(By.xpath("//*[@id=\"per_game\"]/thead/tr/th[26]"));
		stlPerG.click();
		
		//driver.quit();
	}

	
	private static void sleep(int i) {
	
		
	}
	
	
}	

