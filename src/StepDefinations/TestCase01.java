package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestCase01 {

	@When("^user selects Oneway radio$")
	public void SelectRadios() {
		AbstractStepDefinations.driver.findElement(By.xpath("//input[@value='oneway']")).click();
	}
}
