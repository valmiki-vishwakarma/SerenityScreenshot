package pages;

import net.serenitybdd.core.pages.PageObject;

public class HomePage  extends PageObject{

	public void navigate() {
		
		open();
	}
	
	public void enterusername() {
		$("//input[@id='identifierId']").sendKeys("valmikivishwakarma1992@gmail.com");
	}
	
	public void enterPassword() {
		
		$("//div[@id='password']").sendKeys("Pssdj839473437493777777777777");
	}
	
	public void clickNextBtn() {
		$("//span[contains(text(),'Next')]").click();
	}
}
