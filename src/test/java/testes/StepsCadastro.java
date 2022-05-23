package testes;

import drivers.DriversFacotry;
import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class StepsCadastro extends DriversFacotry {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	@Given("desejo realizar um cadastro")
	public void desejo_realizar_um_cadastro() throws InterruptedException {

	}

	@When("efetuo o login")
	public void efetuo_o_login() {
		metodos.clicar(elementos.getSign(), null);
		metodos.escrever(elementos.getEmail(), "roberto2627@gmail.com");
		metodos.clicar(elementos.getCreateanaccount(), "");
		metodos.escrever(elementos.getFirstname(), "Roberto Moreira");
		metodos.escrever(elementos.getLastName(), "Silva");
		metodos.escrever(elementos.getPassword(), "hb2025");
		metodos.escrever(elementos.getDateOfBirth(), "5");
		metodos.escrever(elementos.getDateOfBirth1(), "March");
		metodos.escrever(elementos.getDateOfBirth2(), "1995");
		metodos.clicar(elementos.getSingnUp(), null);
		metodos.clicar(elementos.getReceive(), null);
		metodos.escrever(elementos.getFirstname1(), "Roberto Moreira");
		metodos.escrever(elementos.getLastname(), "Silva");
		metodos.escrever(elementos.getCompany(), "Microsoft");
		metodos.escrever(elementos.getAddress(), "Avenida Presidente Juscelino Kubitscheck");
		metodos.escrever(elementos.getAddress2(), "Bell's Flats");
		metodos.escrever(elementos.getCity(), "Colorado Springs");
		metodos.escrever(elementos.getState(), "Alaska");
		metodos.escrever(elementos.getZippostal(), "80829");
		metodos.escrever(elementos.getHomephone(), "2526-8090");
		metodos.escrever(elementos.getMobilephone(), "(22) 96323-2593");
		metodos.escrever(elementos.getAssingaddress(), "Manitou Springs");
		metodos.clicar(elementos.getRegister(), null);

	}

	@Then("faco cadastro do usuario")
	public void faco_cadastro_do_usuario() {

	}
}
