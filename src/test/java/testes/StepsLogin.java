package testes;

import drivers.DriversFacotry;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class StepsLogin extends DriversFacotry {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	
	@Given("desejo efetuar login")  
	public void desejo_efetuar_login() {
		
	    
	}

	
	@When("preencher os dados corretos")
	public void preencher_os_dados_corretos() {
		
		metodos.clicar(elementos.getSign(), null);
		metodos.escrever(elementos.getEmail(), "roberto2627@gmail.com");
		metodos.escrever(elementos.getPasswordlogin(), "hb2025");
		
		metodos.clicar(elementos.getSignInlogin(), null);
		
		

	}

	@Then("login realizado com sucesso")
	public void login_realizado_com_sucesso() {

	}
}
