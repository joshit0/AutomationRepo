package web.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

	@FindBy(name = "email")
	private WebElementFacade txtEmail;

	@FindBy(name = "password")
	private WebElementFacade txtPassword;

	@FindBy(xpath = "//span[text()='Login']/..")
	private WebElementFacade btnLogin;

	@FindBy(xpath = "//div[contains(@class,'alert-danger')]")
	private WebElementFacade ObtenerMensajeError;

	BasePage base;

	public void IngresarEmail(String texto) {
		base.SendKeysToWebElement(txtEmail, texto);
	}

	public void IngresarPassword(String texto) {
		base.SendKeysToWebElement(txtPassword, texto);
	}

	public void ClickLogin() {
		base.ClickToWebElement(btnLogin);
	}

	public String ObtenerMensajeError() {
		return base.GetTextFromWebElement(ObtenerMensajeError);
	}

}
