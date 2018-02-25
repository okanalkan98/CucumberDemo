package runnerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(features= {"features"},glue= {"stepDefinitionPackage"})
public class TestRunner extends AbstractTestNGCucumberTests{
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("Set up script is running");
		System.out.println("My first cucumber test");
	}
}
