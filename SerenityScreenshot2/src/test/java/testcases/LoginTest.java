package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.HomePageStep;

@RunWith(SerenityRunner.class)
public class LoginTest {

	@Managed
	WebDriver driver;
	
	@Steps
	HomePageStep home;
	
	@Title("Executing login Test")
	@Test
	public void loginTest() {
		Serenity.takeScreenshot();
	home.doLogin();
	}
}
