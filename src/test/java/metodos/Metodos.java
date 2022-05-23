package metodos;

import org.openqa.selenium.By;

import drivers.DriversFacotry;

public class Metodos extends DriversFacotry {

	public void clicar(By elemento, String texto) {
		driver.findElement(elemento).click();

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

}
