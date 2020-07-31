package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearch {

WebDriver driver = null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("browser is open");
		String projectPath = System.getProperty("user.dir");
		System.out.println("project path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user is on google search page");
		driver.navigate().to("https://google.com");		
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() throws InterruptedException {
		System.out.println("user enters text in search box");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated")
	public void user_is_navigated() throws InterruptedException {
		System.out.println("user is navigated");
		driver.getPageSource().contains("Selenium Installation");
		System.out.println("Selenium Installation is present");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
