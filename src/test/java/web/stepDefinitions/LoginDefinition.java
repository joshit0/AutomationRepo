package web.stepDefinitions;

import web.tasks.LoginTask;
import web.tasks.DashboardTask;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDefinition {

    @Steps
    LoginTask loginTask;

    @Steps
    DashboardTask dashboardTask;

    @Given("^Abro la aplicacion AutomationSiteTest$")
    public void ingreso_a_la_aplicacion_AutomationSiteTest() {
        loginTask.AbrirPaginaWeb();
    }

    @Given("^ingreso el email \"([^\"]*)\"$")
    public void ingreso_el_email(String email) {
        loginTask.IngresarEmail(email);
    }

    @Given("^ingreso el password \"([^\"]*)\"$")
    public void ingreso_el_password(String password) {
        loginTask.IngresarPassword(password);
    }

    @When("^doy click en login$")
    public void doy_click_en_login() {
        loginTask.Login();
    }

    @Then("^muestra mensaje \"([^\"]*)\"$")
    public void muestra_mensaje(String mensajeEsperado) {
        String mensajeObtenido = loginTask.ObtenerMensajeError();
        Assert.assertTrue("No se muestra mensaje de error esperado", mensajeObtenido.equals(mensajeEsperado));

    }

    @Then("^accedo al dashboard$")
    public void accedo_al_dashboard() {

        Assert.assertTrue("No se muestra la pantalla dashboard", dashboardTask.PantallaDashboard());

    }
}