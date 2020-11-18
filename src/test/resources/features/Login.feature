@LOGIN_ALL
Feature: Login
	Como usuario
	Quiero realizar login
	Para acceder al sistema

	Background:
		Given Abro la aplicacion AutomationSiteTest

	 @LOGIN_ERROR
	Scenario Outline: Realizar login erroneos
		Given ingreso el email "<email>"
		And ingreso el password "<password>"
		And doy click en login
		Then muestra mensaje "<mensaje_error>"

		Examples:
			| email          | password | mensaje_error                                       |
			| prueba01       | 123456a  | The Email field must contain a valid email address. |
			| aabc@gmail.com | 112344   | Invalid Login Credentials                           |


	@LOGIN_OK
	Scenario: Realizar login satisfactorio
		Given ingreso el email "admin@phptravels.com"
		And ingreso el password "demoadmin"
		And doy click en login
		Then accedo al dashboard


