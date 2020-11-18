package web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {

	WebDriverWait wait;

	public void ClickToWebElement(WebElement element) {
		wait = new WebDriverWait(this.getDriver(), 60);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	public void SendKeysToWebElement(WebElement element, String textToSend) {
		wait = new WebDriverWait(this.getDriver(), 60);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(textToSend);
	}

	public String GetTextFromWebElement(WebElement element) {
		wait = new WebDriverWait(this.getDriver(), 60);
		return wait.until(ExpectedConditions.visibilityOf(element)).getText();
	}

	public boolean WebElementExist(WebElement element) {
		wait = new WebDriverWait(this.getDriver(), 60);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception ex) {
			return false;
		}

	}
}
