package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class CivitasAcademy {

WebDriver driver = null;
	@Given("Go to civitas academy website")
	public void browser_is_open() throws InterruptedException {
		System.out.println("Go to civitas academy website");
		String projectPath = System.getProperty("user.dir");
		System.out.println("project path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("user is on civitas academy");
		driver.navigate().to("https://civitasacademy.co.uk/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@And("click on class pages")
	public void user_is_on_google_search_page() throws InterruptedException {
		System.out.println("user click on class pages");
		//driver.findElement(By.
		driver.findElement(By.xpath("//a[@href='/class-pages']")).click();
		Thread.sleep(5000);
	}

	@Then("click on Kinney class")
	public void user_enters_text_in_search_box() throws InterruptedException {
		System.out.println("click on Kinney class");
		//driver.findElement(By.xpath("//a[@href='/class-pages/elmer']")).click();
		driver.findElement(By.linkText("Year 3- Kinney Class")).click();
		Thread.sleep(5000);
	}

	@Then("click on week 14")
	public void hits_enter() throws InterruptedException {
		System.out.println("click on week 14");
		driver.findElement(By.xpath("//a[@href='/files/Year_3_Home_Learning_Week_14.docx']")).click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

	

}
