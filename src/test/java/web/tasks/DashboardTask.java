package web.tasks;

import net.thucydides.core.annotations.Step;
import web.pages.DashboardPage;

public class DashboardTask {

	DashboardPage dashboardPage;

	@Step
	public boolean PantallaDashboard() {
		return dashboardPage.EsperarPantallaDashboard();
	}
}
