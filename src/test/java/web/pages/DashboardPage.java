package web.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends PageObject {

	@FindBy(xpath = "//strong[contains(text(),'Logout')]/..")
	private WebElementFacade btnLogout;

	BasePage base;

	public boolean EsperarPantallaDashboard() {
		return base.WebElementExist(btnLogout);
	}

}
