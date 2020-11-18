package web.tasks;

import java.util.concurrent.TimeUnit;
import net.thucydides.core.annotations.Step;
import web.pages.LoginPage;

public class LoginTask {

	LoginPage loginPage;

	@Step
	public void AbrirPaginaWeb() {
		loginPage.open();
		loginPage.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Step
	public void IngresarEmail(String texto) {
		loginPage.IngresarEmail(texto);
	}

	@Step
	public void IngresarPassword(String texto) {
		loginPage.IngresarPassword(texto);
	}

	@Step
	public void Login() {
		loginPage.ClickLogin();
	}

	@Step
	public void Login(String email, String password) {
		loginPage.IngresarEmail(email);
		loginPage.IngresarPassword(password);
		loginPage.ClickLogin();
	}

	@Step
	public String ObtenerMensajeError() {
		return loginPage.ObtenerMensajeError();
	}

}
